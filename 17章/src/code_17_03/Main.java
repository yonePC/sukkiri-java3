package code_17_03;

import java.io.FileWriter;

public class Main {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.text");
			fw.write("hello!");
			fw.close();
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}
	}

}
