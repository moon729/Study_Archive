package stream.inputstream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReaderEx1 {

	public static void main(String[] args) {
/*		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			//fileinputstream
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fis.close();
			
			//filereader
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		
		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);
			
			int data = 0;
			while((data = fr.read()) != -1) {
				if(data!='\t' && data != '\n' && data != '\r')
					fw.write(data);
			}
			fr.close();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
