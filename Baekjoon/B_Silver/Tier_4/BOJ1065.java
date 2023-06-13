import java.util.Scanner;

public class Main{
	static int count = 0;
	
	static void hannum(int num) {
		int change_num = num;
		if(num <100) {count++; return;}
		int a, b;
		int diff = (change_num%10- ((change_num/10)%10));
		while(change_num>=10) {			
			a = change_num%10;
			change_num /=10;
			b = change_num %10;
			if(diff != a-b) return;
		}
		count++;
	}
	
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1 ; i <= n;i++) {
			hannum(i);
		}
		System.out.println(count);
	}		
}
