package javastudy;

public class exceptiontest {
	
	//���� ó�� ���̽� �׽�Ʈ 
	public static void main(String[] args) {

		try {
			onAction();
		}catch(Exception e) {
			System.out.println("onAction()���� Exception �߻���");
		}
	}
	
	public static void onAction() throws Exception {
		for(int i = 0; i < 10; i++) {
			try {
				if(i != 6) {
					System.out.println(i + "�� 6�� �ƴ�");
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println(i + "�� 6�� ����. CheckException �� onAction()���� �߻�");
				throw e;
			}
		}
	}
}
