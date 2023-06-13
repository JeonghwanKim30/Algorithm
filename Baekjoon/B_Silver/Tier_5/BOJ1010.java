import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static long left;
	static long right;
	
	static long total;
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < N ; i++) {
			total = 1;
			st = new StringTokenizer(br.readLine());
			left = Integer.parseInt(st.nextToken());
			right = Integer.parseInt(st.nextToken());
			
			for (int j = 0; j < left; j++) {
				total = total * (right - j) / (j + 1);
			}
			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}
	
}