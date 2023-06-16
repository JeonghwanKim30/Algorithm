import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	// 최소값을 저장
	static int min = Integer.MAX_VALUE;

	// 다녀온 도시 체크
	static boolean checked[];

	// 도시의 갯수
	static int n;

	// 가중치 정보를 저장
	static int map[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 도시의 갯수
		n = Integer.parseInt(br.readLine());

		// 가중치
		map = new int[n][n];

		// 다녀온 도시 저장
		checked = new boolean[n];

		// 가중치 정보 저장
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 첫번째 도시부터 n번째 도시까지 시작을 정해줌
		dfs(1, 1, 0, 1);

		// 갱신된 최소값을 출력
		System.out.println(min);

	}

	static void dfs(int from, int cnt, int sum, int init) {
		// 방문 체크
		checked[from] = true;

		// 기저조건 방문한 마을 수가 n개
		if (cnt == n) {
			// 돌아오는 길이 없으면 종료
			if (map[from][init] == 0)
				return;

			// 돌아오기
			sum += map[from][init];

			// 최솟값 갱신
			if (sum < min)
				min = sum;
			return;
		}

		// 갈 도시 탐색
		for (int to = 0; to < n; to++) {

			// 방문하지 않은 도시이며, from에서 연결되어있는 to 일 경우에만 실시
			if (!checked[to] && map[from][to] != 0) {
				// 다음 재귀로 넘겨줌
				dfs(to, cnt + 1, sum + map[from][to], init);
				// 빠져 나오며 방문체크 해제
				checked[to] = false;
			}
		}

		return;
	}
}