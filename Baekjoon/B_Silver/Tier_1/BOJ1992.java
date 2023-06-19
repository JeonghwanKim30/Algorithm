import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int map[][];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		map = new int[N][N];
		
		for(int i = 0 ; i < N ; i++) {
			String arr[] = br.readLine().split("");
			for(int j = 0 ; j < N ; j++) {
				map[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		quardTree(0,0,N);
		
		System.out.println(sb);
	}
	
	static void quardTree(int x, int y, int size) {
		
		int check = map[x][y];
		boolean flag = false;
		for(int i = x; i < x+size; i++) {
			for(int j = y; j < y+size ; j++) {
				if(map[i][j]!= check) {
					sb.append("(");
					int newSize = size/2;
					flag = true;
					quardTree(x,y,newSize);
					quardTree(x,y+newSize,newSize);
					quardTree(x+newSize,y,newSize);
					quardTree(x+newSize,y+newSize,newSize);
					sb.append(")");
				}
				if(flag) break;
			}
			if(flag) break;
		}
		
		if(!flag) {
			sb.append(map[x][y]);
		}
		
	}
}