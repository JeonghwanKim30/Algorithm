import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	static int totalmin = Integer.MAX_VALUE;
	
	//모든 내림수 정렬
	static PriorityQueue<Long> pq = new PriorityQueue<>();
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String temp1 = br.readLine();;
		String temp2 = br.readLine();
		String gearOne;
		String gearTwo;
		
		//긴 게 gearOne , 짧은 게 gearTwo
		if(temp1.length() >= temp2.length()){
			gearOne = temp1;
			gearTwo = temp2;
		}else {
			gearOne = temp2;
			gearTwo = temp1;
		}
		
		int max = gearOne.length();
		int min = gearTwo.length();
		
		//긴 거 에 속해 있을 때
		for(int i = 0 ; i <= max - min ; i++) {
			boolean flag = false;
			for(int j = 0 ; j < min ; j++) {
				if(gearOne.charAt(i+j) == gearTwo.charAt(j) && gearOne.charAt(i+j)=='2' && gearTwo.charAt(j) =='2') {
					flag = true;
					continue;
				}
			}
			if(!flag) {
				System.out.println(max);
				return;
			}
		}
		
		//긴 거 왼쪽에서 들어 올 때
		int totalMax = min + max;
		
		for(int i = 1 ; i < min ; i++) {
			boolean flag = false;
			for(int j = 0 ; j < i; j++) {
				if(gearTwo.charAt(min-i+j)==gearOne.charAt(j) && gearOne.charAt(j)=='2' && gearTwo.charAt(min-i+j) =='2') {
					flag = true;
					continue;
				}
			}
			if(!flag) {
				totalMax = min + max - i;
			}
		}

		//긴 거 오른쪽에서 들어올때
		for(int i = 1 ; i < min ; i++) {
			boolean flag = false;
			for(int j = 0 ; j < i; j++) {
				if(gearTwo.charAt(j)==gearOne.charAt(max-i+j) && gearOne.charAt(max-i+j)=='2' && gearTwo.charAt(j) =='2') {
					flag = true;
					continue;
				}
			}
			if(!flag) {
				if(totalMax > min + max - i) {
					totalMax = min + max - i;
				}
			}
		}
		
		System.out.println(totalMax);
		
	}
}	