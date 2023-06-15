import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		
		int sum[] = new int [n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		sum[0] = arr[0];
		for(int i = 1 ; i < n ; i++) {
			
			if(arr[i] > sum[i-1]+arr[i]) {
				sum[i] = arr[i];
				continue;
			}
			sum[i] = arr[i] + sum[i-1];
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < n ; i++) {
			if(max < sum[i]) max = sum[i];
		}
		System.out.println(max);
		
	}
}
