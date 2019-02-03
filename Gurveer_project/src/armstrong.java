       import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		int n,a,len=0,rem,sum=0;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter a number to check");
    n=s.nextInt();
    a=n;

    while(a>0) {
    	len++;
    	a=a/10;
    }
    
    a=n;
    while(a>0) {
    	int pow=1;
    	rem=a%10;
    	for(int i=1;i<=len;i++) {
    		pow=pow*rem;
    	}
    	sum=sum+pow;
    	a=a/10;
    }
    if(sum==n)
    	System.out.println("armstrong");
    else
    	System.out.println("not armstrong");
    	
	}

}
