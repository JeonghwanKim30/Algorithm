import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static long BitterRate = 1;
	static long SaltyRate = 0;
	static long diff  = Long.MAX_VALUE;
	static long[] bitarr;
	static long[] salarr;
	static int[] idx;
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());
		bitarr = new long[N];
		salarr = new long[N];
		idx = new int[N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			bitarr[i] = Integer.parseInt(st.nextToken());
			salarr[i] = Integer.parseInt(st.nextToken());
		}
		perm(0);
		System.out.println(diff);
	}

	static void perm(int cnt) {
		if (BitterRate >= 10000000000L) {
			BitterRate = 1;
			SaltyRate = 0;
			return;
		}
		if (cnt == N) {
			int zerosum = 0;
			for (int i = 0; i < N; i++) {
				if (idx[i] == 1) {
					BitterRate *= bitarr[i];
					SaltyRate += salarr[i];
				} else
					zerosum++;
			}
			if (zerosum == N) {
				BitterRate = 1;
				SaltyRate = 0;
				return;
			}
			long abs = BitterRate - SaltyRate;
			if (abs < 0)
				abs = -abs;
			if (diff > abs)
				diff = abs;
			BitterRate = 1;
			SaltyRate = 0;
			return;
		}
		idx[cnt] = 1;
		perm(cnt + 1);
		idx[cnt] = 0;
		perm(cnt + 1);
		return;
	}
}