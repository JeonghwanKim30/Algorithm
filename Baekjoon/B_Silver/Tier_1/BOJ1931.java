import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	static int real_max;
	static int max = Integer.MIN_VALUE;
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return o1[1]==o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
			}
		});
		
		perm(arr, N, 0);
		System.out.println(real_max);

	}

	static void perm(int arr[][],int N ,int cnt) {
		for(int i = 0 ; i < N; i++) {
			if(arr[i][0] >= max) {
				max = arr[i][1];
				cnt++;
			}

		}
		real_max = cnt;
	}
}