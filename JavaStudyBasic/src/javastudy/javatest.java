package javastudy;

import java.util.Scanner;

public class javatest {

	public static void main(String[] args) throws Exception {
		
		//�Լ��� throws Exception �ϸ� �Լ��� ȣ���� ������ exception�� �޾Ƽ� ó�� ������. 
		//main �� ���� �� JVM, JRE���� Exception ��Ƽ� ó������. 
		
		try {
			int i = 0;
			
			System.out.println("�� �Է� : " );
			Scanner instr = new Scanner(System.in);
			i = instr.nextInt();
			
			int[] numbers = {1,2,3,4,5};
			System.out.println("�迭�� �� : " + numbers[i]);
			
			//����ڰ� ���� ����. 
			throw new Exception("����ڰ� ������ ����.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ������ �߻���" + e.getMessage());
		}catch(Exception e) {
			System.out.println("���� �߻�!!");
			System.out.println("���� ���� : " + e.getStackTrace());
			
			//throw e;
		}finally {
			System.out.println("finally code");
		}
		
	}
	
}
