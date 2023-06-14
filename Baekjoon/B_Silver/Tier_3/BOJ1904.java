import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[1000001];
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2; 
		
		for(int i = 3; i <=n ; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 15746;
		}
		
		System.out.println(arr[n]);
	}
}