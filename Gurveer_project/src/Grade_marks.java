import java.util.Scanner;

public class Grade_marks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter marks to check grades");
		int marks=s.nextInt();
		int z;
		z=marks/10;
		switch(z)
		{
		case 9:
			System.out.println("Excellent");
			break;
			
		case 8:
			System.out.println("Very good");
			break;
			
		case 7:
			System.out.println("Good");
			break;
			
		case 6:
			System.out.println("Fair");
			break;
			
		case 5:
			System.out.println("Fail");
			break;
		
		default:
			System.out.println("Fail");
			break;
}}}
