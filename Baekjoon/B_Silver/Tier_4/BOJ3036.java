import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static long left;
	static long right;
	
	static long total;
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		
		//입력받기
		for(int i = 0 ; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int mother;
		
		//출력하기
		for(int i = 1 ; i<N ; i++) {
			mother = uclid(arr[0],arr[i]);
			sb.append(arr[0]/mother).append("/").append(arr[i]/mother).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static int uclid(int a, int b) {
		
		if(a < b) {
			int temp = a;
			a = b; 
			b = temp;
		}
		
		if(a%b==0) {
			return b;
		}else {
			return uclid(b, a%b);
		}
	}
	
}