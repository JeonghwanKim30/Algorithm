import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		String str;
		for(int i = 0 ; i < n; i++) {
			str = sc.nextLine();
			recursion(str, 0, str.length()-1, 1);
		}
	}
	
    public static void recursion(String s, int l, int r, int count){
        if(l >= r) {
        	System.out.printf("%d %d\n", 1, count);
        }
        else if(s.charAt(l) != s.charAt(r)) {System.out.printf("%d %d\n", 0, count);}
        else recursion(s, l+1, r-1, count+1);
    }
}
