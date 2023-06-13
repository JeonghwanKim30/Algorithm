import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		int S =0;
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "add" :
					S = S | (1<<Integer.parseInt(st.nextToken())-1);
					break;
				case "remove" :
					S = S & ~(1<<Integer.parseInt(st.nextToken())-1);
					break;
				case "check" :
					if((S & (1<<Integer.parseInt(st.nextToken())-1)) > 0)
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;
				case "toggle" :
					S = (S ^ (1<<Integer.parseInt(st.nextToken())-1));
					break;
				case "all" :
					S = -1;
					break;
				case "empty" :
					S = 0;
					break;
			}
		}
		System.out.println(sb);
	}
}