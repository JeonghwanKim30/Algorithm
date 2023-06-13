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
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int idx = 1;
		
		int arr[] = new int[10000];
		arr[0] = 2;
		
		for(int temp = 3; temp <M ; temp++) {
			for(int i = 0 ; i <= idx; i++) {
				if(i == idx) {
					arr[idx++] = temp;
					break;
				}
				if(temp%arr[i]==0) break;
			}
		}
		
		boolean flag = false;
		int min=0;
		for(int i = M ; i <= N; i++) {
			if(i == 1) continue;
			if(i == 2) {min = 2; sum+=2; flag = true; continue;}
			
			for(int j = 0; j <= idx; j++) {
				if(j == idx) {
					if(!flag) {
						min = i; flag = true;
					}
					sum += i;
					arr[idx++] = i;
					break;
				}
				if(i%arr[j] ==0) break;
			}
		} 
		
		if(!flag) {
			System.out.println(-1);
			return;
		}
		System.out.println(sum);
		System.out.println(min);
	}
}