import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long W = Long.parseLong(st.nextToken());
		long H = Long.parseLong(st.nextToken());
		long f = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		long x1 = Long.parseLong(st.nextToken());
		long y1 = Long.parseLong(st.nextToken());
		long x2 = Long.parseLong(st.nextToken());
		long y2 = Long.parseLong(st.nextToken());
		long answer;
		//다 접은 뒤, 색칠될 직사각형의 높이;
		long height = y2-y1;
		//색칠되기 전의 영역
		long area = W*H;
		
		if(f> W-f) {
			f = W-f;
		}
		
		//좌편향
		if(x2<=f) {
			answer = area-height*(x2-x1)*(c+1)*2;
			System.out.println(answer);
			return;
		}
		
		//우편향
		if(x1>=f) {
			answer = area-height*(x2-x1)*(c+1);
			System.out.println(answer);
			return;
		}
		
		//겹치는 영역 발생
		answer = area - height*((f-x1)*(c+1)*2 + (x2-f)*(c+1));
		System.out.println(answer);
	}
}
