package code18_02;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.text");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
	}

}
