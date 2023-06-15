import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	//인접 행렬로 풀겠습니다.
	static int AdjMatrix[][];
	
	//다녀간 정점 표시하기
	static boolean checked[];
	
	//외부 메서드에서 써먹어야해서
	static StringBuilder sb = new StringBuilder();

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		//정점, 간선 수, 시작 위치 저장
		int N,M,V;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
	
		//배열 정의
		AdjMatrix = new int[N+1][N+1];
		checked = new boolean[N+1];
		
		int from, to;
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			
			//행렬 그래프 연결해버리기
			AdjMatrix[from][to] = 1;
			AdjMatrix[to][from] = 1;
		}
		
		dfs(V,N);
		//사용한 배열 초기화
		Arrays.fill(checked, false);;
		sb.append("\n");
		
		bfs(V,N);
		
		System.out.println(sb);
	}

	static void dfs(int start, int num) {

		//다녀간 정점 Check와 sb에 넣기
		checked[start] = true;
		sb.append(start).append(" ");
		
		for(int i = 1 ; i <= num; i++) {
			if(AdjMatrix[start][i] == 1 && !checked[i]) {
				dfs(i,num);
			}
		}
	}
	
	static void bfs(int start, int num) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//정점을 떠나는 순간에도 방문표시를 해야함
		queue.add(start);
		checked[start] = true;
		int now; 
		
		//완전 탐색할때까지 반복
		while(!queue.isEmpty()) {
			
			//queue에서 뽑을때마다 sb에 추가
			now = queue.poll();
			sb.append(now).append(" ");
			
			//인접 정점들을 추가하는 작업
			for(int i = 1 ; i<=num ;i++) {
				if(AdjMatrix[now][i]==1 && !checked[i]) {
					checked[i] = true;
					queue.add(i);
				}
			}
		}
		
		
	}
	
}