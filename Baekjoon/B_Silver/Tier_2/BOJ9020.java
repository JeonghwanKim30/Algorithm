import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// T : 반복 횟수
		int T  = Integer.parseInt(br.readLine());
		
		//에라스토테네스 어쩌고 하기
		boolean era[] = new boolean[10001];
		
		
		//에레스토 테네스 체크
		for(int i = 2; i <= 10000; i++){
			if(!era[i]) {
				int idx = i+i;
				while(idx <=10000) {
					era[idx] = true;
					idx += i;
				}
			}
		}
		
		//인덱스를 줄이기 위한 리스트 선언
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for(int i = 2 ; i <= 10000; i++) {
			if(!era[i]) arr.add(i);
		}
		
		//반복횟수만큼 반복하기
		for(int i = 0 ; i < T; i++) {
			int object = Integer.parseInt(br.readLine());
			
			//최소값 차
			int min= Integer.MAX_VALUE;
			
			int A=0,B=0;
			
			int tempA, tempB;
			for(int a = 0; a <arr.size()-1; a++) {
				tempA = arr.get(a);
				if(tempA >= object) break;
				for(int b =a ; b <arr.size(); b++) {
					tempB = arr.get(b);
					if(tempA+tempB > object) break;
					if(tempA+tempB == object && tempB-tempA <min) {
						min = tempB - tempA;
						A = tempA;
						B = tempB;
					}
				}
			}
			
			sb.append(A).append(" ").append(B).append("\n");
		}
		
		System.out.println(sb);
	}
	
}