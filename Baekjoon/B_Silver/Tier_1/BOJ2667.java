import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	//정렬 해줄 최소힙
	static PriorityQueue<Integer> queue = new PriorityQueue<>(
			new Comparator<>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return (o1-o2);
				}
				
			});
	
	
	// 단지의 갯수
	static int total;
	// 아파트 갯수 세기
	static int nomalsum=0;
	
	// 지도
	static int map[][];

	// 들렀다 갔니?
	static boolean checked[][];

	// 상 하 좌 우
	static int plusX[] = { -1, 1, 0, 0 };
	static int plusY[] = { 0, 0, -1, 1 };

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		

		// 테두리 두르고 맵에 숫자 집어 넣기
		map = new int[N + 2][N + 2];

		//배열 받기
		String arr[];
		for (int i = 1; i <= N; i++) {
			arr = br.readLine().split("");
			for(int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(arr[j-1]);
			}
		}
		
		
		checked = new boolean[N + 2][N + 2];
		
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (map[i][j] == 1 && !checked[i][j]) {
					dfs(i, j);
					total++;
					queue.add(nomalsum);
					nomalsum = 0;
				}
			}
		}

		sb.append(total).append("\n");
		while(!queue.isEmpty()) {
			sb.append(queue.poll()).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int x, int y) {
		nomalsum++;
		checked[x][y] = true;
		int newx;
		int newy;
		
		for (int i = 0; i < 4; i++) {
			newx = x + plusX[i];
			newy = y + plusY[i];
			if (map[newx][newy] == 1 && !checked[newx][newy]) {
				dfs(newx, newy);
			}
		}
	}
}