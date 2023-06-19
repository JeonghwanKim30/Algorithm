import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int arr[];
	static int brr[];
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		//트리를 선언하기 위해서 크기를 받기. 트리 리프노드는 깊이가 증가할때마다 +1개가 늘어난다.
		for(int i = 1 ; i <= N ; i++ ) {
			sum += i;
		}
		
		//최종적으로 필요한 노드 수 만큼 배열 선언
		arr = new int[sum+1];
		//arr = 입력값 받아오기, brr = 은 부분의 최대값을 저장
		brr = new int[sum+1];
		
		
		//idx : 1에서 부터 순회하면서 배열 값 채워넣기
		int idx = 1;
		for(int i = 1 ; i <= N ; i++ ) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1 ; j <= i; j++) {
				arr[idx++] = Integer.parseInt(st.nextToken()); 
			}
		}

		//초기값 설정
		brr[1] = arr[1];
		
		if(N == 1) {
			System.out.println(arr[1]);
			return;
		}
		//부분합 트리를 계산해나감

		idx = 2;
		int temp;
		
		
		//트리의 부분합 계산
		for(int i = 2; i <= N ; i++) {
			for(int j = 1; j <= i; j++) {
				if(j==1) {
					brr[idx] = arr[idx] + brr[idx-i+1];
					idx++;
					continue;
				}
				if(j==i) {
					brr[idx] = arr[idx] + brr[idx-i];
					idx++;
					continue;
				}
				brr[idx] = brr[idx-i+1] + arr[idx];
				temp = brr[idx-i] + arr[idx];
				if(temp > brr[idx]) {
					brr[idx] = temp;
				}
				idx++;
			}
		}
		
		int max = 0;
		
		for(int i = 0 ; i <= N; i ++) {
			if(max < brr[sum-i])
				max = brr[sum-i];
		}
		
		System.out.println(max);
	}
}