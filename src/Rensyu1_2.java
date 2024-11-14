
public class Rensyu1_2 {
	public static void main(String[] args) {
		double area = calcTriangleArea(10.0, 5.0);
		System.out.println(area);
		
		double area2 = calcCircleArea(5.0);
		System.out.println(area2);
	}
	
	public static double calcTriangleArea(double bottom, double height) {
		double ans = bottom * height / 2;
		return  ans;
	}
	
	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}
}
