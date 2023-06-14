import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static int brr[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		arr = new int[N+1];
		brr = new int[N+1];
		st = new StringTokenizer(br.readLine());
		int idx = 1;
		while (st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			brr[idx] = brr[idx-1] + arr[idx];
			idx++;
		}
		int a,b;
		StringBuilder sb = new StringBuilder();
		int sum;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = brr[b];
			sum -= brr[a-1];
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}