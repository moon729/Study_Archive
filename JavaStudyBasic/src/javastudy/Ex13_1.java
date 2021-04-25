package javastudy;

public class Ex13_1 {
	
	public static void main(String[] args) {
		
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		// Thread �̸� Thread-0, Thread-1 ��µ� 
	}
}

class ThreadEx1_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(getName()); //������ Thread�� getName() ȣ�� 
		}
	}
}


class ThreadEx1_2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()); //����� �ƴϴ� �ٷ� getName() ȣ���� �ȵǰ�, Thread Ŭ���� �����ͼ� ȣ�� 
			//Thread.currentThread() = ���� �������� Thread ��ȯ
		}
	}
}