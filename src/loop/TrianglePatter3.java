package loop;

import java.util.Scanner;

public class TrianglePatter3 {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=1 ; i<=n ; i++) {
			
			char ch = 'A';
			for (int j=1 ; j<=n ; j++) {
				System.out.print(ch);
				ch = (char)(ch + 1);
			}
			System.out.println();
		}
	}
	
}
