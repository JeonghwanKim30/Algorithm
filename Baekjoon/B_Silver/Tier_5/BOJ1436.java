import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int num = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int now = 666;
		String temp;
		while(true) {
			temp = Integer.toString(now);
			if(temp.contains("666")) {
				cnt++;
			}
			if(cnt == num) {break;}
			now++;
		}
		System.out.println(now);
	}
}