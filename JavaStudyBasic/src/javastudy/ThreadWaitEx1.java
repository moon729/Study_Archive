package javastudy;
import java.util.ArrayList;

public class ThreadWaitEx1 {
	public static void main(String[] args) throws Exception {
		Table table = new Table(); // 여러 쓰레드가 공유하는 객체
		
		new Thread(new Cook(table), "COOK1").start();
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);
		System.exit(0);
	}
}

class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + "ate a " + food);
		}
	}

}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) { this.table = table; }
	
	public void run() {
		while(true) {
			int idx = (int)(Math.random()*table.dishNum());
			table.add(table.dishNames[idx]);
			
			try {
				Thread.sleep(100); // cook이 빠르게 serve 하지 못하고 조금 지연시키면 customer가 waiting
			}catch(InterruptedException e) {}
		}
	}
}

class Table {
	String[] dishNames = { "donut", "donut", "burger"};
	final int MAX_FOOD = 6; //테이블에 놓을 수 있는 최대 음식 개수 
	
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		// 테이블에 음식이 가득 있으면, 음식을 추가하지 않음
		if(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "is waiting");
			
			try {
				wait();
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
		
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public synchronized void remove(String dishName) {
		String name = Thread.currentThread().getName();
		
		while(dishes.size() == 0) {
			
			System.out.println(name + " is waiting ");
			try {
				wait();
				Thread.sleep(500); 
			} catch(InterruptedException e) {}
		}
		// 지정된 요리와 일치하는 요리를 테이블에서 제거
		
		while(true) {
			for(int i = 0; i < dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			}
			
			try {
				System.out.println(name + "is waiting");
				wait();
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}

	}
	public int dishNum() {
		return dishNames.length;
	}
}








