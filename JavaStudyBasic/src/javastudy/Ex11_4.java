package javastudy;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
	
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help �Է� �� ���� �� �� ����");
		
		while(true) {
			System.out.print(">>");
			try {
				//ȭ�����κ��� ���� ������ �Է¹ޱ� 
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue; //�ƹ��͵� �Է� ���ϸ� ��� try 
				
				if(input.equalsIgnoreCase("q")) { //��ҹ��� ��x
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - ����");
					System.out.println("q - ���α׷� ����");
					System.out.println("history - �ֱ� �Է� ��ɾ�");
				}else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					//queue ��� �κ�
					save(input);
					
					//linkedlist�� ���� �����ֱ�
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "."+it.next());
					}
					
				}else {
					save(input); //q, help ���� ��ɾ�� ��� q.save()�� 
					System.out.println(input); //�Է��� ��ɾ� ��� �����ֱ� 
				}
			}catch(Exception e) {
				System.out.println("�Է� ���� �߻�");
			}
		}
	}
	
	public static void save(String input) {
		//queue�� ����
		if(!"".equals(input)) 
			q.offer(input);
		
		//queue�� �ִ� ũ�� ������ ���� ó�� �Է��� �� ����
		if(q.size() > MAX_SIZE)
			q.remove();
	}
}
