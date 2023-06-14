import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int result[];
	static int flag[] = {0};
	static int A,B;
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		result = new int[B];
		flag = new int[A];
		perm(0);
	}
	
	static void perm(int cnt) {
		if(cnt == B) {System.out.println(
				Arrays.toString(result).replace("[","")
				.replace("]", "")
				.replace(",","")
				);return;}
		
		for(int i = 0 ; i < A; i++) {
			if(flag[i] == 1) {continue;}
			flag[i] = 1;				
			result[cnt] = i+1;
			perm(cnt+1);
			flag[i] = 0;
		}
	}
}