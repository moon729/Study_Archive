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

	//hashCode ���ÿ��� equals, name  �ݵ�� �������̵� �ؾ� ��!
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Person)) return false;
		
		//obj�� ����ȯ���� ������ age, name ������ ����� �� ���� 
		Person p = (Person)obj;
		
		//�� �ڽ� (this)�� �̸��� ���̸� p �� �� 
		return this.name.equals(p.name) && this.age == p.age;
	}
}