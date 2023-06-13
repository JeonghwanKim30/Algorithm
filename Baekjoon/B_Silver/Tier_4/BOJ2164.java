import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		Queue<Integer> queue = new LinkedList<>();
		
		int count = Integer.parseInt(br.readLine());
		for(int i = 1 ; i <= count ; i++) {
			queue.add(i);
		}
		
		int temp = 1;
		for(int i = 0 ; i < count-1; i++) {
			queue.poll();
			temp = queue.poll();
			queue.add(temp);
		}
		System.out.println(temp);
	}
}