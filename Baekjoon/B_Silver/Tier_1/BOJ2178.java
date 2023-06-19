import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int arr[][];
	
	static int N;
	static int M;
	//상하좌우 사방탐색
	static int drow[] = {-1,1,0,0};
	static int dcol[] = {0,0,-1,1}; 
	
	static Queue<Integer[]> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int [N+2][M+2];
		
		String s;
		//배열에 채워넣기~
		for(int i = 1; i <= N ; i++) {
			s = br.readLine();
			for(int j = 1 ; j <= M ; j++) {
				arr[i][j] = (s.charAt(j-1)) - '0';
			}
		}
		
		//시작위치 집어넣기
		queue.add(new Integer[] {1,1});
		
		bfs();
		
	}	
	static void bfs() {
		
		int rst = 1;
		
		while(!queue.isEmpty()){
			
			int size = queue.size();
			
			for(int s = 0 ; s < size; s++) {
				Integer[] now = queue.poll();
				
				if(now[0] == N && now[1] == M) {
					System.out.println(rst);
					return;
				}
				
				//사방위 탐색
				for(int i = 0 ; i < 4 ; i++) {
					int nx = now[0] + drow[i], ny = now[1] + dcol[i];
					if(arr[nx][ny] == 0) continue;
					arr[nx][ny] = 0;
					queue.add(new Integer[] {nx,ny});
				}
			}
			rst++;
		}		
		
	}
}