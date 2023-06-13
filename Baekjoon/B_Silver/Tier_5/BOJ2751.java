import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i <N; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		while(!queue.isEmpty()) {
			sb.append(queue.poll()).append("\n");
		}
		System.out.println(sb);
	}
}