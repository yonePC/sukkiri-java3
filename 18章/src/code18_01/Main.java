package code18_01;

import java.io.FileReader;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("data.text");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();
	}

}
