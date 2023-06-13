import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 입력 받기
		int Num = Integer.parseInt(st.nextToken());
		int Snake = Integer.parseInt(st.nextToken());
		// 집어넣을 우선순위큐 지정
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 - o2;
			}
		});
		
			
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < Num; i++) {
			queue.offer(Integer.parseInt(st.nextToken()));
		}
		int now;
		while(!queue.isEmpty()) {
			now = queue.poll();
			if(now <= Snake) Snake++;
			else break;
		}

		System.out.println(Snake);

	}
}