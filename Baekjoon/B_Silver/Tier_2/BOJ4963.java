import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	// 섬의 갯수
	static int total;
	
	// 지도
	static int map[][];
	
	//들렀다 갔니?
	static boolean checked[][];
	
	//북, 북동, 동, 동남, 남, 남서, 서, 북서
	static int plusX[] = {-1,-1,0,1,1,1,0,-1};
	static int plusY[] = {0,1,1,1,0,-1,-1,-1};
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		while(true) {
			st = new StringTokenizer(br.readLine());
			int y, x;
			
			sum = 0;
			
			y = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			
			//종료조건
			if(x==0) {break;}
			
			//테두리 두르고 맵에 숫자 집어 넣기
			map = new int[x+2][y+2];
			checked = new boolean[x+2][y+2];
			for(int i = 1; i<=x ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 1 ; j<= y; j++) {
					map[i][j]= Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 1; i <= x ; i++) {
				for(int j = 1 ; j <=y ; j++) {
					if(map[i][j] ==1 && !checked[i][j]) {
						dfs(i,j);
						sum++;
					}
				}
			}
			
			sb.append(sum).append("\n");
			
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int x, int y) {
		
		checked[x][y] = true;
		int newx;
		int newy;
		
		for(int i = 0 ; i < 8; i++) {
			newx = x+plusX[i];
			newy = y+plusY[i];
			if(map[newx][newy] ==1 && !checked[newx][newy]) {
				dfs(newx,newy);
			}
		}
	}
}