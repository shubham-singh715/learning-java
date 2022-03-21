package recursion;
import java.util.Scanner;
public class R2_Power {

	public static int power(int x, int n) {
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return power(x,n-1)*x;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		 int p=power(x,n);
		 System.out.println(p);

	}

}
