import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer arr[] = new Integer [n+1];
		
		arr[0] = 0;
		arr[1] = 0;
		
		for(int i = 2 ; i <= n ; i++) {
			
			if(i%3 == 0) {
				arr[i] = arr[i/3]+1;
				if(i%2 == 0 && arr[i/3] > arr[i/2]) {
					arr[i] = arr[i/2] + 1;
				}
			}else if(i%2 == 0) {
				arr[i] = arr[i/2]+1;
			}
			if(arr[i] == null) {
				arr[i] = arr[i-1]+1;
			}else {
				if(arr[i] > arr[i-1]+1) {
					arr[i] = arr[i-1]+1;
				} 
			}
		}
		
		System.out.println(arr[n]);
	}
}