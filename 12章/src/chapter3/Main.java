package chapter3;

public class Main {
	public static void main(String[] args) {
		Wizard w = new Wizard();
		Matango ma = new Matango();
		w.name = "アサカ";
		w.attack(ma);
		w.fireball(ma);
		
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
				
	}

}
