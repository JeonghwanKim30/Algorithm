import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        
        for(int T  = 0 ; T < test_case; T++) {
        	int n = sc.nextInt();
        	int arr[] = new int[n];
        	double average = 0.0;
        	for(int i = 0 ; i < n; i++) {
        		arr[i] = sc.nextInt();
        		average += arr[i];
        	}
        	average /= n;
        	int over =0 ;
        	for(int i = 0 ; i<n; i++) {
        		if(arr[i] > average) {over++;}
        		
        	}
        	average = ((double)over/n)*100;
        	
        	System.out.println(String.format("%.3f%%", average));
        }
    }
}
