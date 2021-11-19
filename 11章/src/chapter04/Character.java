package chapter04;

public abstract class Character {
	String name;
	int hp;
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public abstract void attack(Matango m);
		///System.out.println(this.name + "の攻撃！");
		///m.hp -= 
		///System.out.println("敵にポイントのダメージを与えた！");		
	

}
