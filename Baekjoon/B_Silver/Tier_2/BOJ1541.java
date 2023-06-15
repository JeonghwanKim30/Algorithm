import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Object> queue = new LinkedList<>();

		String[] expression = br.readLine().split("");

		int idx = 0;

		// 식이 안 들어오면 0 출력하고 종료
		if (expression.length == 0) {
			System.out.println(0);
			return;
		}

		while (idx < expression.length) {
			if (expression[idx].equals("+")) {
				queue.add(Integer.parseInt(sb.toString()));
				sb.setLength(0);
				queue.add("+");
				idx++;
				continue;
			}
			if (expression[idx].equals("-")) {
				queue.add(Integer.parseInt(sb.toString()));
				sb.setLength(0);
				queue.add("-");
				idx++;
				continue;
			}
			sb.append(expression[idx]);
			idx++;
		}
		
		queue.add(Integer.parseInt(sb.toString()));
		
		int num = 0;
		int result = (int) queue.poll();
		int temp = 0;
		String op;
		while (!queue.isEmpty()) {
			op = (String) queue.poll();
			switch (op) {
			case "+":
				temp = (int) queue.poll();
				result += temp;
				break;
			case "-":
				temp = (int) queue.poll();
				result -= temp;
				while(!queue.isEmpty()) {
					queue.poll();
					temp = (int) queue.poll();
					result-=temp;
				}
				break;
			}
		}

		System.out.println(result);
	}
}