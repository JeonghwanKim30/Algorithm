import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 입력 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int [N+1];
		
		for(int i = 1 ; i <= N; i++) {
			arr[i] = i;
		}
		
		int temp;
		for(int i = 0 ; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			temp = arr[from];
			arr[from] = arr[to];
			arr[to] = temp;
		}
		
		for(int i = 1 ; i <= N; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}