import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       int plus = 6;
       int start = 1;
       int cha = 0;
       
       int count = 1;
       while(start < n) {
    	   cha += plus;
    	   start += cha;
    	   count++;
       }
       System.out.println(count);
    }
}