import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static boolean Checked[] = new boolean [5001];
	static int Total_Time;
	static int Destination;
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Destination = Integer.parseInt(br.readLine());
		bfs();
		
		System.out.println(Total_Time);
		
	}
	
	static void bfs() {
	
		Queue<int[]> queue = new LinkedList<int[]>();
		
		queue.offer(new int[] {0,0});
		int now[];
		int new3;
		int new5;
		while(!queue.isEmpty()) {
			now = queue.poll();
			if(now[0] == Destination) {
				Total_Time = now[1];
				return;
			}
			new3 = now[0] + 3;
			new5 = now[0] + 5;
			if(new3 <=Destination && Checked[new3] == false) {
				queue.offer(new int[] {now[0]+3,now[1]+1});
				Checked[new3] = true;
			}
			if(new5 <=Destination && Checked[new5] == false) {
				queue.offer(new int[] {now[0]+5,now[1]+1});
				Checked[new5] = true;
			}
		}
		
		if(queue.isEmpty()) {
			Total_Time = -1;
		}
		return;
	}
}