import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int arr[] = new int[21];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <=20;i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(arr[n]);
		
	}
}
