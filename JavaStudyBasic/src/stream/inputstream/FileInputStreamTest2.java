package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i = 0;
			
			while((i = fis.read(bs)) != -1) { //fis���� �о bs�� �ֱ� 
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println();
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
