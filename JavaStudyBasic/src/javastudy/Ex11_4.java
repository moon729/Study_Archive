package javastudy;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help 입력 시 도움말 볼 수 있음");
		
		while(true) {
			System.out.print(">>");
			try {
				//화면으로부터 라인 단위로 입력받기 
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue; //아무것도 입력 안하면 계속 try 
				
				if(input.equalsIgnoreCase("q")) { //대소문자 비교x
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말");
					System.out.println("q - 프로그램 종료");
					System.out.println("history - 최근 입력 명령어");
				}else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					//queue 사용 부분
					save(input);
					
					//linkedlist의 내용 보여주기
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "."+it.next());
					}
					
				}else {
					save(input); //q, help 외의 명령어는 계속 q.save()함 
					System.out.println(input); //입력한 명령어 계속 보여주기 
				}
			}catch(Exception e) {
				System.out.println("입력 오류 발생");
			}
		}
	}
	
	public static void save(String input) {
		//queue에 저장
		if(!"".equals(input)) 
			q.offer(input);
		
		//queue의 최대 크기 넘으면 제일 처음 입력한 것 삭제
		if(q.size() > MAX_SIZE)
			q.remove();
	}
}
