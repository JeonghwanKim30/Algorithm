import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++) {
        	String s = sc.next();
        	int plus = 1;
        	int sum = 0;
        	for(int j = 0 ; j < s.length(); j++) {
        		if(s.charAt(j) == 'O') {
        			sum += plus++;
        		}
        		if(s.charAt(j) == 'X') {
        			plus = 1;
        		}
        	}
        	System.out.println(sum);
        }
        
    }
}
