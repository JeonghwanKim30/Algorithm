import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[N+1][N+1];
		int brr[][] = new int[N+1][N+1];
		
		for(int i = 1 ; i <= N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j <=N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(j==1) {
					brr[i][j] = brr[i-1][N]+arr[i][j];
				}else {
					brr[i][j] = brr[i][j-1] + arr[i][j];
				}
			}
			
			for(int j = 1 ; j <=N ; j++) {
				brr[j][0] = brr[j-1][N];
			}
		}
		
		for(int i = 0 ; i < M ; i ++) {
			st = new StringTokenizer(br.readLine());
			int x1,y1,x2,y2;
			int sum;
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			sum = brr[x2][y2] - brr[x1][y1-1];
			for(int j = 0 ; j< x2-x1; j++) {
				sum -= brr[x2-j][y1-1]-brr[x2-j-1][N] + (brr[x1+j][N]-brr[x1+j][y2]);
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}