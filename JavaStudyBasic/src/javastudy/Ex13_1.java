package javastudy;

public class Ex13_1 {
	
	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		// Thread 이름 Thread-0, Thread-1 출력됨 
	}
}

class ThreadEx1_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); //조상인 Thread의 getName() 호출 
		}
	}
}


class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); //상속이 아니니 바로 getName() 호출은 안되고, Thread 클래스 가져와서 호출 
			//Thread.currentThread() = 현재 실행중인 Thread 반환
		}
	}
}