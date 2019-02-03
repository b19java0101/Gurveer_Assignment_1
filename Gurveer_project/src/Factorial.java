import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int  i,fact=1;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter any number to find its factorial");
		int n=ob.nextInt();
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " +n +" is " +fact);
	}

}
