import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < 2 * N - 1; i++) {
			if (i < N) {
				for (int j = 1; j < N - i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < i*2 +1; j++) {
					System.out.print("*");
				}
			}
			if (i >= N) {
				for(int j = N; j <= i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (2*N-1)-2*(i-N+1);j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}