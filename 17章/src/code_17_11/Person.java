package code_17_11;

public class Person {
	int age;
	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("年齢は0以上の数を指定するべきです。指定値=" + age);
		}
		this.age = age;
	}

}
