package chapter04;


public class Fool extends Character implements Human {
	public void attack(Matango m) {
		System.out.println(this.name + "は戦わず遊んでいる");
	}

	public void run() {	}

	public void talk() { }

	public void wathch() { }

	public void hear() { }

}
