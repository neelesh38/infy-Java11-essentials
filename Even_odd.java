//Java program to check whether the given number is even or odd
//Observe the output for different values of a number variable

public class Even_odd {
	public static void main(String[] args) {
		int number = 8;
		if (number % 2 == 0) {
			// This block will get executed if the if-condition is true
			System.out.println(number + " is an even number");
		} else {
			// This block will get executed if the if-condition is false
			System.out.println(number + " is an odd number");
		}
	}
}
