import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		HashMap <String,Integer> map = new HashMap<>();
		
		PriorityQueue <String> queue = new PriorityQueue<>();
		
		int DM = Integer.parseInt(st.nextToken());
		int BM = Integer.parseInt(st.nextToken());

		int count = 0;

		for (int i = 0; i < DM; i++) {
			map.put(br.readLine(), i);
		}

		String temp;
		for (int i = 0; i < BM; i++) {
			temp = br.readLine();
			if (map.containsKey(temp)) {
				count++;
				queue.add(temp);
			}
		}
		System.out.println(count);
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}