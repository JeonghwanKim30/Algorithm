import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int arr[][] = new int[15][15];
		for(int i = 1 ; i < 15; i++) {
			arr[0][i] = arr[0][i-1]+i;
		}

		for(int i =1 ; i <=14; i++) {
			for(int j= 1 ; j <= 14; j++) {
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}

		for(int T = 0; T < test_case; T++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append((arr[k][n] - arr[k][n-1])).append("\n");
		}
		
		System.out.println(sb);
	}
}