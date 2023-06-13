import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int min = 0;
		int temp;
		for(int i = 1 ; i <= N ; i++) {
			temp = i;
			sum = i;
			while(temp >0) {
				sum+= temp%10;
				temp /= 10;
			}
			if(sum == N) {min = i; break;}
		}
		if( min== 0) System.out.println(0);
		else System.out.println(min);
	}
}
