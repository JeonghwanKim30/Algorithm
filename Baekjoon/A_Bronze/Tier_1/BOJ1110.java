import java.util.Scanner;

public class Main{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int num = n;
		int sum = 0;
		while(true) {
			sum = num%10 + num/10;
			num = num%10;
			num = num*10 + sum%10;
			count++;
			if(num == n) {
				System.out.println(count);
				return;
			}
		}
	}
}