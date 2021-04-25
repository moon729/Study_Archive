package javastudy;
import java.util.*;

public class Ex11_16 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password 입력하세요.");
			System.out.print("id : ");
			String id = s.nextLine().trim(); //뒤에 공백 입력되도 trim 처리 
			
			System.out.print("pw : ");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다.");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력!");
				continue;
			}
			else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
	}
}
