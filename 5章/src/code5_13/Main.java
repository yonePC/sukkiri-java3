package code5_13;

public class Main {
	public static void incAarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,3};
		incAarray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}
