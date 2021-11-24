package chapter02;

public class Hero {
	private int hp;
	String name;
	Sword sword;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	
	private void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAMEOVERです。");
	}

}
