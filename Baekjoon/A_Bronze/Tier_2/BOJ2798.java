import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		int diffbefore =300000;
		int diffafter = 0;
		for(int i = 0 ; i <N-2; i ++) {
			for(int j = i+1 ; j < N-1; j++) {
				for(int k = j+1 ; k < N ; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					if(M - sum < 0) continue;
					else diffafter = M - sum;
					if(diffbefore > diffafter) {
						diffbefore =diffafter;
						max = sum;
					}
					
				}
			}
		}
		System.out.println(max);
	}
}
