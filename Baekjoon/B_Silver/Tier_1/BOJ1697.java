import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static boolean checked[] = new boolean[100011];
	static int Me;
	static int Sister;
	static int Fast_Time;
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Me = Integer.parseInt(st.nextToken());
		Sister = Integer.parseInt(st.nextToken());
		
		bfs();
		System.out.println(Fast_Time);
	}
	
	static void bfs() {
		int now;
		int time = 0;
		int size = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		//수빈이의 현재 위치를 큐에 잡아넣기
		queue.offer(Me);
		checked[Me] = true;
		
		while(!queue.isEmpty()) {
			size = queue.size();
			for(int i = 0 ; i < size; i++) {
				now = queue.poll();
				if(now == Sister) { // 동생 잡았으면 시간 리턴
					Fast_Time = time;
					return;
				}
				
				if(now+1 <= 100010 && checked[now+1] == false) { //배열 크기 넘어가면 안 넣음
					queue.offer(now+1);
					checked[now+1] = true;
				}
				if(now!= 0 && now*2 <= 100010 && checked[now*2] == false) { //배열 크기 넘어가면 안 넣음
					queue.offer(now*2);
					checked[now*2] = true;
				}
				if(now-1 <= 100010 && now -1 >= 0 && checked[now-1] == false) { //배열 크기 넘어가면 안 넣음
					queue.offer(now-1); 
					checked[now-1] = true;
				}
			}
			time++;
		}
	}
}