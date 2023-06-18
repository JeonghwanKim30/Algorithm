import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthToolTipUI;

public class Main {

	public static void main(String[] args) throws IOException {

		//선언부
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken()), B = Long.parseLong(st.nextToken()), C = Long.parseLong(st.nextToken());
		
		System.out.println(division(A,B,C));
		
		
	}
	
	static long division(long A, long B, long C) {
		
		if(B == 1) {
			return A%C;
		}
		if(B % 2 == 0) {
			long temp = division(A,B/2,C);
			return ((temp)%C)*((temp)%C)%C; 
		}
		if(B%2 == 1) {
			long temp = division(A,B/2,C);
			return ((A)%C*(temp)%C*(temp)%C)%C;
		}
		return 0;
	}
}