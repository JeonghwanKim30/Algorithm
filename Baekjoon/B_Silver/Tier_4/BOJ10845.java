import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		//명령어 갯수+1 만큼 배열 지정
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N+1];
		
		int start = 0;
		int rear = 0;

		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			int diff = rear - start;
			
			switch(str) {
			case "push": 
				arr[rear++] = Integer.parseInt(st.nextToken());
				break;
			case "pop": 
				if(diff == 0) System.out.println(-1);
				if(diff != 0) System.out.println(arr[start++]);
				break;
			case "size": 
				System.out.println(diff);
				break;
			case "empty": 
				if(diff == 0) System.out.println(1);
				if(diff != 0) System.out.println(0);
				break;
			case "front": 
				if(diff == 0) System.out.println(-1);
				if(diff != 0) System.out.println(arr[start]);
				break;
			case "back": 
				if(diff == 0) System.out.println(-1);
				if(diff != 0) System.out.println(arr[rear-1]);
				break;
			}
		}
	}
}	