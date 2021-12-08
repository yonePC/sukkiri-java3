package practice17;

public class Main {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e){
			System.out.println("NullPointException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
	}

}
