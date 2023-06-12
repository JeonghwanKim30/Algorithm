import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int A ,B;
		st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		while(A!=0 || B!=0) {
			int res;
			if(A/B == 0) {
				res = 0;
			}else {
				res = 1;
			}
			
			switch(res) {
				case 0 :
					if(B%A == 0) {System.out.println("factor"); break;}
					System.out.println("neither");
					break;
				case 1 :
					if(A%B == 0) {System.out.println("multiple"); break;}
					System.out.println("neither");
					break;
			}
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
		}
	}
}