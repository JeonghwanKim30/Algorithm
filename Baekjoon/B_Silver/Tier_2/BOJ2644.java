import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Data {
		int x;
		Data link = null;

		public Data(int x, Data link) {
			super();
			this.x = x;
			this.link = link;
		}

		@Override
		public String toString() {
			return "Data [x=" + x + ", link=" + link + "]";
		}

	}

	static Data List[];

	static boolean checked[];

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());

		// 관계를 구할 두 사람 입력 받기
		int A, B;
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		// 사람의 수만큼 체크, 리스트를 생성
		List = new Data[num + 1];
		checked = new boolean[num + 1];

		// 입력되는 관계를 받아오기 위해
		int T = Integer.parseInt(br.readLine());

		// 부모, 자식 관계 설정
		int from;
		int to;

		// Data 쓰레기값
		Data temp;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());

			temp = new Data(to, List[from]);
			List[from] = temp;
			temp = new Data(from, List[to]);
			List[to] = temp;
		}

		bfs(A, B);

	}

	static void bfs(int from, int to) {
		Queue<Data> queue = new LinkedList<>();
		
		int sum =0;
		
		Data now = List[from];
		
		checked[from] = true;
		
		for (; now != null;) {
			queue.add(now);
			if (!checked[now.x]) {
				checked[now.x] = true;
			}
			now = now.link;
		}

		while (!queue.isEmpty()) {
			sum++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {

				now = queue.poll();

				// 발견 해버리면?
				if (now.x == to) {
					System.out.println(sum);
					return;
				}

				// 발견 못했으면 다음 연결된 녀석들을 queue에 넣어주기
				Data temp = List[now.x];
				
				for (; temp != null;) {
					if (!checked[temp.x]) {
						checked[temp.x] = true;
						queue.add(temp);
					}
					temp = temp.link;
				}
			}
		}

		if (queue.isEmpty())
			sum = 0;

		if (sum == 0) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		return;
	}
}