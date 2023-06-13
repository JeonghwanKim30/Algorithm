import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		//선언부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[10000001];
		int sum = 0;
		for(int i = 1; sum <= 10001000; i++) {
			arr[i] = sum+i;
			sum += i;
		}
		int idx =0;

		while(arr[idx] < N) {
			idx++;
		}
		
		boolean odd = false;
		if(idx%2 != 0) {odd = true ;}
		
		int diff = N - arr[idx-1];
		if(odd == true) {
			System.out.println((idx+1-diff) + "/"+(diff));
		}
		else {
			System.out.println((diff)+ "/"+ (idx+1-diff));
		}
		
	}
}