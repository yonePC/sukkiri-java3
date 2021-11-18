package chapter10_03;

public class Item {
	String name;
	int price;
	
	public Item(String name) {
		this.name = name;
		this.price = 0;
		System.out.println(this.name +  "は" + this.price + "円です");
	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println(this.name +  "は" + this.price + "円です");
	}

}
