import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int xto = Integer.parseInt(st.nextToken());
		int yto = Integer.parseInt(st.nextToken());
		
		int arr[] = {y,xto-x,yto-y};
		
		int min = x;
		for(int i = 0 ; i < 3 ; i++) {
			if(min > arr[i]) min = arr[i];
		}
		
		System.out.println(min);
	}
}
