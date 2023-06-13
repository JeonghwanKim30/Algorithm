import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		for(int i = 0 ; i < str.length();i++) {
			if(str.charAt(i) == 'c') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='=' || str.charAt(i)=='-') {sum++;continue;}
				sum++;
				i--;
				continue;
			}
			if(str.charAt(i) == 'd') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='z') {
					if(++i >= str.length()) {sum +=2;break;}
					if(str.charAt(i)=='=') {sum++;continue;}
					sum ++;
					i -=2;
					continue;
				}
				if(str.charAt(i)=='-') {sum++;continue;}
				sum ++;
				i--;
				continue;
			}
			if(str.charAt(i) == 'n') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='j') {sum++;continue;}
				sum++;
				i--;
				continue;
			}
			if(str.charAt(i) == 'l') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='j') {sum++;continue;}
				sum++;
				i--;
				continue;
			}
			if(str.charAt(i) == 's') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='=') {sum++;continue;}
				sum++;
				i--;
				continue;
			}
			if(str.charAt(i) == 'z') {
				if(++i >= str.length()) {sum++; break;}
				if(str.charAt(i)=='=') {sum++;continue;}
				sum++;
				i--;
				continue;
			}
			sum++;
		}
		System.out.println(sum);
	}
}
