import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Top { // 탑에 대한 정보
	int num; // 탑의 번호
	int height; // 탑의 높이

	Top(int num, int height) {
		this.num = num;
		this.height = height;
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		Stack<Top> stack = new Stack<>();
		StringBuilder answer = new StringBuilder();

		int temp;

		st = new StringTokenizer(br.readLine());

		temp = Integer.parseInt(st.nextToken());
		stack.add(new Top(1, temp));
		answer.append("0 ");

		for (int i = 2; i <= N; i++) {
			temp = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty()) {
				if (stack.peek().height >= temp) {
					answer.append(stack.peek().num).append(" ");
					stack.add(new Top(i,temp));
					break;
				}
				stack.pop();
			}
			if(stack.isEmpty()) {
				answer.append("0 ");
				stack.add(new Top(i,temp));
			}
		}
		System.out.println(answer);
	}
}