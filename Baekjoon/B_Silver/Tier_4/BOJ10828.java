import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int idx = 0;
		int arr[] = new int [10000];
		
		int N = Integer.parseInt(br.readLine());
		
		
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			
			switch(st.nextToken()) {
				case "push" :	
					arr[idx++] = Integer.parseInt(st.nextToken());
					break;
				case "pop" :	
					if(idx == 0) System.out.println(-1);
					else {
						System.out.println(arr[idx-1]);
						idx--;
						}
					break;
				case "size" :	
					System.out.println(idx);
					break;
				case "empty" :	
					if(idx == 0) System.out.println(1);
					else System.out.println(0);
					break;
				case "top" :	
					if(idx == 0) System.out.println(-1);
					else System.out.println(arr[idx-1]);
					break;
			}
		}
	}
}