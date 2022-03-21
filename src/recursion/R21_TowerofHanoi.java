package recursion;

public class R21_TowerofHanoi {
	//s-source ; a=auxilary; d-destination

	public static void tower(int n,char s,char a,char d) {
		if(n==0) {
			return;
		}
		tower(n-1,s,d,a);
		System.out.println(s +"  "+d);
		tower(n-1,a,s,d);
	}
	public static void main(String[] args) {
		int n=3;
   tower(n, 'a', 'b','c');
	}

}
