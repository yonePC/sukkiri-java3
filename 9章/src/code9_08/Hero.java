package code9_08;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}	
		
//	public Hero() {
//		this.hp = 100;
//		this.name = "ダミー";
//	}
	
	public Hero() {
		this("ダミー");
	}

}
