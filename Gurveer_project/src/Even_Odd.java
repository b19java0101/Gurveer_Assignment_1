import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int n=s.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("Odd number");
			
}}
