import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//받아 올 숫자 배열을 저장
		int arr[] = new int [N];
		
		//숫자 배열을 채워 넣기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//길이에 대한 DP
		//length 배열은 해당 idx에 도달하는 숫자열 중 가장 길이가 긴 숫자열의 길이가 저장 됨
		int length[] = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			//우선은 해당 위치의 값을 1로 초기화
			length[i] = 1;

			//length 배열의 값들을 비교해서, i 번쨰 arr에 오는 방법이 최대인 것을 고름
			for(int j = 0 ; j <i; j++) {
				if(arr[i]>arr[j]) {
					length[i]=Math.max(length[i], length[j] +1);
				}
			}
		}

		//length 배열 중에서 가장 큰 배열 값 찾아오기
		int max =0;
		for(int i = 0 ; i < N ; i++) {
			if(length[i] > max) max = length[i];
		}
		System.out.println(max);
	}
}