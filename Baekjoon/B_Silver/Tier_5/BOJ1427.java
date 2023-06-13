import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

		public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int [10];
		
		while(N>0) {
			arr[N%10]++;
			N /= 10;
		}
		
		for(int i = 9 ; i >= 0; i--) {
			while(arr[i] > 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}