import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][2];
		
		int dp[][] = new int[N+1][C+1];
		
		//입력 받기
		for(int i = 1 ; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//dp 배열 설계
		//최상단 더미 데이터 삽입
		for(int i = 0 ; i <= C; i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}
		//아이템 갯수만큼 반복
		for(int i = 1 ; i <= N; i++){
			//목표치만큼
			for(int j = 1; j <= C; j++) {
				if(j-arr[i][1]<=0) {
					if(dp[i-1][j] > arr[i][0]) {
						dp[i][j]=arr[i][0];
					}else {
						dp[i][j] = dp[i-1][j];
					}
					continue;
				}
				if(dp[i-1][j]>dp[i][j-arr[i][1]]+arr[i][0]) {
					dp[i][j] = dp[i][j-arr[i][1]]+arr[i][0]; 
				}else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		
		System.out.println(dp[N][C]);
		
	}
}
