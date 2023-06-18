import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//집의 갯수 입력 받기
		int houseNum = Integer.parseInt(br.readLine());
		
		//행 = 집의 번호, 열 = 해당 집을 색칠하는데에 드는 비용
		int map[][] = new int[houseNum+1][3];
		
		//집 색칠 비용을 입력 받기
		for(int i = 1; i <= houseNum; i++) {
			st = new StringTokenizer(br.readLine());
			map[i][0] = Integer.parseInt(st.nextToken());
			map[i][1] = Integer.parseInt(st.nextToken());
			map[i][2] = Integer.parseInt(st.nextToken());
		}

		//min = n번쨰 까지 집을 색칠했을때 비용의 최소값
		int min[][] = new int[houseNum+1][3];
		
		//1행 0 : 빨간색, 1행 1 초, 1행 2 파
		min[1][0] = map[1][0];
		min[1][1] = map[1][1];
		min[1][2] = map[1][2];
		
		
		//min[i][0] = i 번쨰 집을 칠했을때 빨간색 칠한거 ...
		for(int i = 2; i <= houseNum; i++) {
			min[i][0] = map[i][0]+Math.min(min[i-1][1], min[i-1][2]);
			min[i][1] = map[i][1]+Math.min(min[i-1][0], min[i-1][2]);
			min[i][2] = map[i][2]+Math.min(min[i-1][0], min[i-1][1]);
		}
		
		System.out.println(Math.min(min[houseNum][0],Math.min(min[houseNum][1],min[houseNum][2])));
	}
}