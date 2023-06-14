import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	static StringBuilder sb = new StringBuilder();
	
	static int brr[];
	
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int M = Integer.parseInt(st.nextToken());
	
	brr = new int[M+1];
	perm(1,1,N,M);
	
	System.out.println(sb);
	}
	
	static void perm(int cnt, int start, int N, int to) {
		if(cnt == to+1) {
			for(int i = 1; i <= to; i++){
				sb.append(brr[i]);
				sb.append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start ; i <= N; i++) {
			brr[cnt] = i;
			perm(cnt+1,i+1,N,to);
		}
	}
}