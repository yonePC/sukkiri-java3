package code5_06;

public class Main {
	public static void main(String[] args) {
		int x = 100;
		int y = 10;
		add();
	}
	
	public static void add() {
		//mainメソッドで定義したxとyは他のメソッドでは使えないのでエラーになる
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}

}
