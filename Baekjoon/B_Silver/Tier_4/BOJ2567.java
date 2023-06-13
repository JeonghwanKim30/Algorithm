import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	//북,동북,동,남동,남,남서,서,북서
	static int dx [] = {-1,0,1,0 };
	static int dy [] = {0,1,0,-1};
	
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		//지도 제작
		boolean map[][] = new boolean [102][102];
		
		//색종이의 갯수
		int N = Integer.parseInt(br.readLine());
		
		//x = 행의 좌표, y = 열의 좌표
		int x;
		int y;
		int temp;
		
		//색종이의 갯수만큼 시행
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			y = Integer.parseInt(st.nextToken()) +1;
			temp = Integer.parseInt(st.nextToken());
			x = 100-temp;
			
			for(int plusX = 0; plusX < 10; plusX++) {
				for(int plusY = 0 ; plusY <10; plusY++) {
					int newx = x - plusX;
					int newy = y + plusY;
					map[newx][newy] = true;
				}
			}
		}

		
		//둘레탐색
		for(int i = 1 ; i <= 100 ; i++) {
			for(int j = 1 ; j<=100; j++) {
				
				//true인 지역에 도달하면
				if(map[i][j] == true) {
					int count = 0;
					for(int d = 0 ; d < 4; d++) {
						//테두리 지역이면 check가 true가 된다.
						if(!map[i+dx[d]][j+dy[d]]) {
							count++;
						}
					}
					sum += count;
				}
			}
		}
		
		System.out.println(sum);
	}
}