package practice5_1;

public class Main {
	public static void main(String[] args) {
		introduceOneself("名前", 20, 150, '子');
	}
	
	public static void introduceOneself(String name, int age, double height, char animal) {
		System.out.println("名前は" + name);
		System.out.println("年齢は" + age);
		System.out.println("身長は" + height);
		System.out.println("干支は" + animal);
	}

}
