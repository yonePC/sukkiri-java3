package code8_01;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました!");
		
		Matango m1 = new Matango();
		m1.hp = 100;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 100;
		m2.suffix = 'B';
		
		h.sit(5);
		h.slip();
		h.sit(25);
		m1.run();
		m2.run();
		h.run();
	}

}
