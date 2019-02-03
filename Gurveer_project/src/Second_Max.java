import java.util.Scanner;

public class Second_Max {
		public static void main(String[] args) {
			int[] arr=new int[10];
			int i,max,sec_max;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter array elements");
			for(i=1;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			max=arr[0];
			for(i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			}
			System.out.println("Maximum no. is " +max);
			sec_max=arr[0];
			for(i=1;i<arr.length;i++) {
				if(arr[i]>sec_max && arr[i]<max) {
					sec_max=arr[i];
				}
			}
System.out.println("Second Maximum no. is " +sec_max);
		}
}
