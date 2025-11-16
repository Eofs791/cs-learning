package a2;

public class FooCorporation {
	public static void main(String[] args) {
		printTotalpay(7.5, 35);
		printTotalpay(8.2, 47);
		printTotalpay(10.00, 73);
	}
	
	public static void printTotalpay(double base, int hour) {
		if (checkBasepay(base) && checkHours(hour)) {
			System.out.println("The total pay is " + (hour % 40 * base + (hour - hour % 40 ) * base * 1.5));
			
		}
	}
	
	public static boolean checkBasepay(double base) {
		if (base < 8) {
			System.out.println("The base pay must not be less than the minimum wage ($8.00 an hour)!");
			return false;
		} else 
			return true;
	}
	
	public static boolean checkHours(int hour) {
		if (hour > 60) {
			System.out.println("Working hours should not greater than 60!!");
			return false;
		} else 
			return true;
	}
}
