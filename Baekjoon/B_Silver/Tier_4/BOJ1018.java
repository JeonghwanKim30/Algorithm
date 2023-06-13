import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int M,N;
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		
		
		
		String WB[] = new String[] {"W","B"};
		
		int idx1 = 0;
		int idx2 = 1;
		
		int temp1, temp2;
		
		//경우의 수가 2개
		int min1=Integer.MAX_VALUE, min2=Integer.MAX_VALUE;

		String arr[][] = new String[M][N];
		
		String temp[];
		for(int i = 0; i < M; i++) {
			temp = br.readLine().split("");
			for(int j = 0; j < N ; j++) {
				arr[i][j] = temp[j];
			}
		}
		
		for(int x = 0 ; x <= M-8; x++) {
			for(int y = 0; y<=N-8; y++) {
				temp1 = 0; 
				temp2 =0;
				idx1 = 0;
				idx2 = 1;
				for(int i = 0 ; i <8; i++) {
					for(int j = 0; j < 8 ; j++) {
						if(!arr[i+x][j+y].equals(WB[idx1%2]))
							temp1++;
						if(!arr[i+x][j+y].equals(WB[idx2%2]))
							temp2++;
						idx1++;
						idx2++;
					}
					idx1++;
					idx2++;
				}
				if(temp1 < min1) min1 = temp1;
				if(temp2 < min2) min2 = temp2;
			}
		}
		System.out.println(min1 < min2 ? min1 : min2);
	}
}