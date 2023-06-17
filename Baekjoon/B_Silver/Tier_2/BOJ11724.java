import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static class Data{
		LinkedList<Integer> list = new LinkedList<Integer>();

	}
	
	static boolean checked[];
	
	static int Total = 0;
	static Data arr[]; 
	static Queue<Integer> queue = new LinkedList<Integer>();

	public static void main(String args[]) throws NumberFormatException, IOException {
	
		//선언부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new Data[N+1];
		checked = new boolean[N+1];
		
		for(int i = 1; i <=N; i++) {
			arr[i] = new Data();
		}
		
		for(int i = 0 ; i< M ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a].list.add(b);
			arr[b].list.add(a);
		}
		
			
			for(int i = 1; i <= N ; i++) {
				if(checked[i] == false) {
					checked[i] = true;
					bfs(i);
				}
			}
		System.out.println(Total);
		
	}
 	
 	static void bfs(int i) {
 		queue.add(i);
 		int from;
 		int to;
 		while(!queue.isEmpty()) {
 			from = queue.poll();
 			while(!arr[from].list.isEmpty()) {
 				to = arr[from].list.poll();
 				if(!checked[to]) {
 					queue.add(to);
 					checked[to] = true;
 				}
 			}
 		}
 		
 		Total++;
 		
 		return;
 	}
}