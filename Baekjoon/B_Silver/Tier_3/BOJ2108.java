import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		int sansul=0;
		int middle=0;
		int most=0;
		
		int range=0;
		int min=0;
		int max=0;
		
		double sum = 0;
		
		//최빈값
		int arr[] = new int [8001];
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i <N; i++) {
			queue.add(Integer.parseInt(br.readLine()));
		}
		
		int temp =0;
		
		//특이케이스 저장
		if(N==1) {
			temp = queue.poll();
			System.out.println(temp);
			System.out.println(temp);
			System.out.println(temp);
			System.out.println(0);
			return;
		}
		
		min = queue.poll();
		arr[min+4000]++;
		sum+= min;
		for(int i = 2 ; i <= N-1 ; i++) {
			temp = queue.poll();
			
			// 중앙값
			if(i == (N)/2+1) {
				middle = temp;
			}
			
			arr[temp+4000]++; //최빈값
			sum+= temp; //산술평균
		}
		
		max= queue.poll();
		arr[max+4000]++;
		sum+=max;
		if(sum <0) {
			sansul = (int)((sum/N)-0.5);
		}else {
			sansul = (int)((sum/N)+0.5);
		}
		
		
		int store=0;
		boolean flag = false;
		for(int i = 0; i <= 8000; i++) {
			if(arr[i] > store) {
				flag = true;
				store = arr[i];
				most = i-4000;
				continue;
				}
			if(arr[i]==store && flag) {
				store = arr[i];
				most = i-4000;
				flag = false;
			}
		}
		
		range = max - min;
		
		System.out.println(sansul);
		System.out.println(middle);
		System.out.println(most);
		System.out.println(range);
	}
}