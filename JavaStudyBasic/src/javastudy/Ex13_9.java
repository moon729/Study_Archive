package javastudy;

import javax.swing.JOptionPane;

public class Ex13_9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է�");
		System.out.println("�Է��� ���� " + input + " �Դϴ�.");
		th1.interrupt();
	}
}

class ThreadEx9_1 extends Thread {
	public void run() {
		int i = 10;
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x = 0; x < 2500000000L; x++);
		}
		
		System.out.println("isinterrupted() : " + isInterrupted());
		System.out.println("isinterrupted() : " + isInterrupted());
		System.out.println("th1 interrupted : " + Thread.interrupted());
		System.out.println("th1 interrupted : " + Thread.interrupted());
		System.out.println("ī��Ʈ �����");
	}
}