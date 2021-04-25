package stream.inputstream;

import java.io.RandomAccessFile;

public class RandomFileTest {

	public static void main(String[] args) throws Exception {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("안녕");
		System.out.println(rf.getFilePointer());
		
		rf.seek(0); //pointer를 처음으로 이동해서 읽어야 함 
		int i = rf.readInt();
		double d = rf.readDouble();
		String s = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
	}

}
