import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int rank[];
	static int weight[];
	static int height[];
	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		rank = new int[N];
		weight = new int [N];
		height = new int [N];
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
			
			for(int j = 0 ; j <i; j++) {
				int win = 0;
				int lose = 0;
				if(weight[i] == weight[j] || height[i] == height[j]) continue;
				if(weight[i] > weight[j]) win++;
				if(weight[i] < weight[j]) lose++;
				if(height[i] > height[j]) win++;
				if(height[i] < height[j]) lose++;
				if(win > lose) rank[j]++;
				if(lose > win) rank[i]++;
			}
		}
		
		for(int i = 0 ; i < N; i++) {
			System.out.print(rank[i]+1+" ");
		}
	}
}