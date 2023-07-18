import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 목표값 입력 받기
		int target = Integer.parseInt(br.readLine());
		int num = Integer.parseInt(br.readLine());

		// 고장난 애들 찾기
		boolean number[] = new boolean[10];
		if (num > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < num; i++) {
				number[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int min = Integer.MAX_VALUE;
		int pick = 1000000;
		
		for(int i = 0 ; i < target*2+100; i++) {
			String str = i+"";
			boolean flag = true;
			
			//고장난 버튼에 해당하는 값이 있는지 탐색
			for(int j = 0 ; j < str.length(); j++) {
				if(number[str.charAt(j)-'0']) {
					flag = false;
					break;
				}
			}
			
			//고장난 버튼이 있으면 다음 숫자를 탐색
			if(!flag) {
				continue;
			}
			
			if(min > Math.abs(target-i)) {
				min = Math.abs(target-i);
				pick = i;
			}
		}
		
		
		if(Math.abs(target-100)<Math.abs(target-pick)+(pick+"").length()) {
			System.out.println(Math.abs(target-100));
		}else {
			System.out.println(Math.abs(target-pick)+(pick+"").length());
		}
		
	}
}