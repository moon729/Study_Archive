package stream.inputstream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader fis = new InputStreamReader(new FileInputStream("read.txt"))) {
			//byte 단위로 읽어서 한글 오류가 나기 때문에 보조 스트림 InputStreamReader 사용 
			
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
