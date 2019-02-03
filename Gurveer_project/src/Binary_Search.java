import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		int i, first, last, middle, n, search, array[];
		 
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = s.nextInt();
	    array = new int[n];
	  
	    System.out.println("Enter " + n + " elements");
	 
	 
	    for (i = 0; i < n; i++)
	      array[i] = s.nextInt();
	 
	    System.out.println("Enter value to find");
	    search = s.nextInt();
	 
	    first  = 0;
	    last   = n - 1;
	    middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( array[middle] < search )
	        first = middle + 1;    
	      else if ( array[middle] == search )
	      {
	        System.out.println(search + " found at location " + (middle + 1) + ".");
	        break;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	   if (first > last)
	      System.out.println(search + " isn't present in the list.\n");

	}

}
