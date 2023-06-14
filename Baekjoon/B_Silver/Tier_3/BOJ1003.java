import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] zerosum = new int[41];
	static int[] onesum = new int[41];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		zerosum[0] = 1;
		zerosum[1] = 0;
		onesum[0] = 0;
		onesum[1] = 1;
		for(int i = 2 ; i<=40;i++) {
			zerosum[i] = zerosum[i-1]+zerosum[i-2];
			onesum[i] = onesum[i-1]+onesum[i-2];
		}
		int test_case = Integer.parseInt(br.readLine());
		
		for(int T = 1; T<= test_case; T++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(zerosum[N]);
			sb.append(" ");
			sb.append(onesum[N]);
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}