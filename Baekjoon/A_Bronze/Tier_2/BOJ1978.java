import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthToolTipUI;

public class Main {

	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		if(N ==0 ) System.out.println(0);
		st = new StringTokenizer(br.readLine());
		
		int sum = 0;
		int temp =0;
		for(int i = 0 ; i < N; i++) {
			temp = Integer.parseInt(st.nextToken());
			
			for(int j = 2; j <= temp; j++) {
				if(j == temp) {sum++; break;}
 				if(temp%j == 0) {break;}
			}
		} 
		
		System.out.println(sum);
	}
}