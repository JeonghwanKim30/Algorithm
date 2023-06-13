import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int arr[]= new int[9];
	static int brr[]= new int[7];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0 ; i < 9 ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		pick(0,0,0);
		
	}
	
	static void pick(int n, int start ,int sum) {
		
		if(n == 7 && sum ==100) {
			for(int i = 0 ; i < 7 ;i++) {
				sb.append(brr[i]).append("\n");
			}
			System.out.println(sb);
			return;
		}else if(n==7) {return;}
		
		for(int i = start; i < 9;i++) {
			brr[n] = arr[i];
			pick(n+1,i+1,sum+brr[n]);
		}
	}
}