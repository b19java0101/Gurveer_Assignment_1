import java.util.Scanner;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of series");
		int n=s.nextInt();
		int t1=0,t2=1,sum;
		for(int i=1;i<=n;i++) {
			System.out.print(t1+",");
			sum=t1+t2;
			t1=t2;
			t2=sum;
}}}
