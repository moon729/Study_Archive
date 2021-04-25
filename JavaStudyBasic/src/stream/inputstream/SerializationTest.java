package stream.inputstream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	String name, title;
	
	public Person() {}
	public Person(String name, String title) {
		this.name = name;
		this.title = title;
	}
	public String toString() {
		return name + "," + title;
	}
}
public class SerializationTest {

	public static void main(String[] args) {
		Person personLee = new Person("lee", "manager");
		try(FileOutputStream fos = new FileOutputStream("serial.data");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
