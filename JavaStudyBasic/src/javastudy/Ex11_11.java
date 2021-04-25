package javastudy;
import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}
}


class Person {
	String name; 
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}

	//hashCode 사용시에는 equals, name  반드시 오버라이딩 해야 함!
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Person)) return false;
		
		//obj를 형변환하지 않으면 age, name 변수를 사용할 수 없음 
		Person p = (Person)obj;
		
		//나 자신 (this)의 이름과 나이를 p 와 비교 
		return this.name.equals(p.name) && this.age == p.age;
	}
}