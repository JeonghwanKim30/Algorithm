import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		String A;
		String B;
		Scanner sc = new Scanner(System.in);

		A = sc.next();
		B = sc.next();
		
		if(A.length() < B.length()) {
			String temp = B;
			B = A;
			A = temp;
		}
		String sum ="";
		
		int cnt = 0;
		for(int i = 0; i < A.length() ; i++) {
			if(i < B.length()) {
				int total = 
				(int)(A.charAt((A.length()-1)-i)-'0') + 
				(int)(B.charAt(B.length()-1-i) - '0') + cnt;
				if(total >=10) {cnt =1;}else {cnt = 0;}
				sum+= Integer.toString(total%10);
			}else {
				int total = 
				(int)(A.charAt((A.length()-1)-i)-'0') + cnt;
				if(total >=10) {cnt =1;}else {cnt = 0;}
				sum+= Integer.toString(total%10);
			}
		}
		
		if(cnt == 1) sum+= Integer.toString(1);
		for(int i = 1 ; i <= sum.length(); i++) {
			System.out.printf("%c",sum.charAt(sum.length()-i));
		}
	}
	
} 