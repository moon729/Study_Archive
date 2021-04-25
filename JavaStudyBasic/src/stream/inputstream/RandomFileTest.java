package stream.inputstream;

import java.io.RandomAccessFile;

public class RandomFileTest {

	public static void main(String[] args) throws Exception {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		System.out.println(rf.getFilePointer());
		
		rf.writeUTF("�ȳ�");
		System.out.println(rf.getFilePointer());
		
		rf.seek(0); //pointer�� ó������ �̵��ؼ� �о�� �� 
		int i = rf.readInt();
		double d = rf.readDouble();
		String s = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
	}

}
