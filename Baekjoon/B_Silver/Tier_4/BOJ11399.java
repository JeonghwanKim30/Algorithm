import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0 ; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		
		int dp[] = new int[N];
		
		int sum = 0;
		dp[0] = arr.get(0);
		sum += dp[0];
		for(int i = 1 ; i < N; i++) {
			dp[i] = arr.get(i)+dp[i-1];
			sum+=dp[i];
		}
		
		System.out.println(sum);
	}
}