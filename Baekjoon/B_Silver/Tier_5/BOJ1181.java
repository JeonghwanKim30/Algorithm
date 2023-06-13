import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

		public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<String> queue[] = new PriorityQueue[51];
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 50; i++) {
			queue[i] = new PriorityQueue<String>();
		}
			
		
		String temp ;
		for(int i = 0 ; i < N ; i++) {
			temp = br.readLine();
			if(queue[temp.length()].contains(temp)) continue;
			queue[temp.length()].add(temp);
		}
		
		for(int i = 1; i <= 50; i++) {
			while(!queue[i].isEmpty()) {
				sb.append(queue[i].poll()).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}