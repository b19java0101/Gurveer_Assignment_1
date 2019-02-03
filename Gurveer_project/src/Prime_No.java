
public class Prime_No {

	public static void main(String[] args) {
		System.out.println("All prime no bw 1 to 100 are");
		for(int i=2;i<=100;i++){
		if(i%2==0 || i%3==0 || i%5==0 || i%7==0){

			System.out.print("");
			if(i==2 || i==3 || i==5 ||i==7){
				System.out.println(i);
			}
			else{
				System.out.print("");
			}
		}
		else
			System.out.println(i);
			
		
}}}


