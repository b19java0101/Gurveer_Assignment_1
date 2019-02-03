import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year to check");
		int year=s.nextInt();
		if(year%4==0)
			System.out.println("Leap Year");
		else
			System.out.println("Not a leap year");

}}
