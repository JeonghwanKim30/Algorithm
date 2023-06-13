import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		boolean[][] checked = new boolean[100][100];

		int N = Integer.parseInt(br.readLine());
		int x;
		int y;
		for(int i = 0 ; i <N; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			for(int new_row = 99-y; new_row >=90-y; new_row--) {
				for(int new_col = x; new_col <= x+9; new_col++) {
					checked[new_row][new_col] = true;
				}
			}
		}
		
		int count =0;
		
		for(int i =0; i <100;i++) {
			for(int j =0 ; j <100; j++) {
				if(checked[i][j] == true) count++;
			}
		}
		System.out.println(count);
		
	}
}