
public class Diamond {

	public static void main(String[] args) {
		int x;
		for(int i=1;i<=5;i++){
			x=97;
			if(i<=3) {
			for(int j=5;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print((char)x);
				x++;
				}
			for(int t=1;t<i;t++) {
				x=x-2;
				System.out.print((char)x);
				x++;
			}
			
		}
			else {
				x=97;
				for(int j=2;j<=i;j++){
					System.out.print(" ");
				}
				for(int k=5;k>=i;k--){
					System.out.print((char)x);
					x++;
					}
				for(int t=i;t<5;t++) {
					x-=2;
					System.out.print((char)x);
					x++;
				}
			}
  System.out.println();
		}
}
}
