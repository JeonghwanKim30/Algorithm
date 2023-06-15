import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	static int arr[][];
	static int blue = 0;
	static int white = 0;

	public static void main(String args[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());

		arr = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		partition(1, 1, N);
		System.out.println(white);
		System.out.println(blue);

	}

	static void partition(int startX, int startY, int size) {
		if (size == 0) {
			return;
		}

		int temp = arr[startX][startY];
		for (int i = startX, cntX = 0; cntX < size; cntX++) {
			for (int j = startY, cntY = 0; cntY < size; cntY++) {
				if (temp != arr[i + cntX][j + cntY]) {
					partition(startX, startY, size / 2);
					partition(startX, startY + size / 2, size / 2);
					partition(startX + size / 2, startY, size / 2);
					partition(startX + size / 2, startY + size / 2, size / 2);
					return;
				}
			}
		}

		if (temp == 1)
			blue++;
		if (temp == 0)
			white++;
		return;

	}
}