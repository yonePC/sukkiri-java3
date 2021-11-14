package code6_05.calcapp.main;
import code6_06.calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a  = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = code6_06.calcapp.logics.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "引くと" + delta);
	}

}
