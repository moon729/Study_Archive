package javastudy;

import java.util.Scanner;

public class javatest {

	public static void main(String[] args) throws Exception {
		
		//함수에 throws Exception 하면 함수를 호출한 곳에서 exception을 받아서 처리 가능함. 
		//main 에 선언 시 JVM, JRE에서 Exception 잡아서 처리해줌. 
		
		try {
			int i = 0;
			
			System.out.println("값 입력 : " );
			Scanner instr = new Scanner(System.in);
			i = instr.nextInt();
			
			int[] numbers = {1,2,3,4,5};
			System.out.println("배열의 값 : " + numbers[i]);
			
			//사용자가 던진 오류. 
			throw new Exception("사용자가 생성한 오류.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 오류만 발생함" + e.getMessage());
		}catch(Exception e) {
			System.out.println("오류 발생!!");
			System.out.println("오류 내용 : " + e.getStackTrace());
			
			//throw e;
		}finally {
			System.out.println("finally code");
		}
		
	}
	
}
