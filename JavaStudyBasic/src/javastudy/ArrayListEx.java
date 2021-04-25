package javastudy;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(1);
		list1.add(0);
		list1.add(3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		//list1이 list2의 원소를 모두 contains하고 있는가? 
		System.out.println("list1.containsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //index3에 A 삽입 
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분 남기고 삭제 
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체 삭제 
		System.out.println("list2.removeAll(list1) : " + list2.removeAll(list1));
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}
