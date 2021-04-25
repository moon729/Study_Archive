package stream.inputstream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos)) {
				dos.write(100);
				dos.writeInt(50);
				dos.writeChar('a');
				dos.writeUTF("abcde");
			
				
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//inputstream
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dis = new DataInputStream(fis)) {
				System.out.println(dis.read());
				System.out.println(dis.readInt());
				System.out.println(dis.readChar());
				System.out.println(dis.readUTF());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
