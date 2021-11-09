package practice5_4;

public class Main {
	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10, 5);
		System.out.println("三角形の面積は" + triangleArea);
		
		double circleArea = calcCircleArea(5);
		System.out.println("円の面積は" + circleArea);
		
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		return bottom + height / 2;
	}
	
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}

}
