package practice8;

public class Main {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "クレリック";
		
		
		c.selfAid();
		c.pray(2);
		System.out.println("現在のステータスはHP" + c.hp + ",MP" + c.mp + "です");
	}
	

}
