import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a no. to print its table");
		int n=s.nextInt();
		int j,z;
		for(z=1;z<=10;z++) {
			j=n*z;
			System.out.println(n+"X"+z+"="+j);
}}}
