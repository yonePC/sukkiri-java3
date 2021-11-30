package code15_09;

public class Main {
	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.name = "minato";
		hero.job = "hero";
		hero.gold = 280;
		
		Hero hero2 = new Hero();
		hero2.name = "minatonZ";
		hero2.job = "doragonmaster";
		hero2.gold = 10000;
				
		
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		
		String s2 = String.format(FORMAT, hero2.getName(), hero2.getJob(), hero2.getGold());
		System.out.println(s2);
	}

}
