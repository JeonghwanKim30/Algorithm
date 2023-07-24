import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	//모든 내림수 정렬
	static PriorityQueue<Long> pq = new PriorityQueue<>();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= 10 ; i++) {
			perm(0,i, 9, "");
		}
		
		int max = pq.size();
		Long rst = null;
		if(N>max) {System.out.println(-1); return;}
		for(int i = 0 ; i < N; i++) {
			rst = pq.poll();
		}
		System.out.println(rst);

	}
	
	public static void perm(int cnt, int idx, int start, String num) {
		
		if (cnt == idx) {
			pq.add(Long.parseLong(num));
			return;
		}
		
		for(int i = start; i >=0; i--) {
			perm(cnt + 1 , idx , i-1, num+Integer.toString(i));
		}
	}
}	