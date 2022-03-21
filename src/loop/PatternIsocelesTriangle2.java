package loop;

import java.util.Scanner;

public class PatternIsocelesTriangle2 {

	public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          int n= sc.nextInt();
          
          for (int i=1 ; i<=n ;i++) {
        	  int l=i;
        	  for (int space =1 ; space <=n-i; space++) {
        		  System.out.print(" ");
        	  }
        	  
        	  for(int j=1; j<=i ; j++) {
        		 
        		  System.out.print(l);
        		  l=l+1;
        	  }
        	  
        	  for (int k = (2*i)-2; k>1 ;k--) {
        		  System.out.print(k);
        		  
        	  }
        	  System.out.println();
          }
          

	}

}
