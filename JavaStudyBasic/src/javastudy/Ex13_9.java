package javastudy;

import javax.swing.JOptionPane;

public class Ex13_9 {
	public static void main(String[] args) {
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input + " 입니다.");
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
		System.out.println("카운트 종료됨");
	}
}