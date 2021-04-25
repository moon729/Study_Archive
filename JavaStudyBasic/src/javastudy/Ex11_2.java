package javastudy;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		Queue<String> q = new LinkedList<String>();
		
		st.push("0"); // 지네릭스 안넣었더니 raw type이라고 오류남. 
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("- stack - ");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("- queue - ");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
