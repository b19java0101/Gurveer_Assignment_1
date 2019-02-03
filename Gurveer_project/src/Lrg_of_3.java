import java.util.Scanner;
public class Lrg_of_3 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner s=new Scanner(System.in);
		int x,y,z;
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		if(x>y&&x>z)
			System.out.println(x + " is largest");
		else if(y>x&&y>z)
			System.out.println(y + " is largest");
		else if(z>x&&z>x)
			System.out.println(z + " is largest");
		else
			System.out.println("number are distinct");

}}
