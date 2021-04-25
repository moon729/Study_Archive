package stream.inputstream;

import java.util.Scanner;

public class ScannerTetst {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		int num = scanner.nextInt();
		
		System.out.println(name);
		System.out.println(num);
	}

}
