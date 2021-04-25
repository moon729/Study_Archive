package javastudy;

public class exceptiontest {
	
	//예외 처리 케이스 테스트 
	public static void main(String[] args) {

		try {
			onAction();
		}catch(Exception e) {
			System.out.println("onAction()에서 Exception 발생함");
		}
	}
	
	public static void onAction() throws Exception {
		for(int i = 0; i < 10; i++) {
			try {
				if(i != 6) {
					System.out.println(i + "는 6이 아님");
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println(i + "는 6이 맞음. CheckException 이 onAction()에서 발생");
				throw e;
			}
		}
	}
}
