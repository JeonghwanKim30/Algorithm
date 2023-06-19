import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	// 맵 정보
	static int firstmap[][];
	static int middlemap[][];
	static int finalmap[][];

	static Queue<Integer> qx = new LinkedList<Integer>();
	static Queue<Integer> qy = new LinkedList<Integer>();

	static int plusX[] = { -1, 1, 0, 0 };
	static int plusY[] = { 0, 0, -1, 1 };

	static int R, C, N;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());

		firstmap = new int[R][C];
		middlemap = new int[R][C];
		finalmap = new int[R][C];

		String arr[];
		for (int i = 0; i < R; i++) {
			arr = br.readLine().split("");
			for (int j = 0; j < C; j++) {
				switch (arr[j]) {
				case "O":
					firstmap[i][j] = 1;
					qx.add(i);
					qy.add(j);
					break;
				case ".":
					firstmap[i][j] = 0;
					break;
				}
			}
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				middlemap[i][j] = 1;
			}
		}

		// final 체우기
		int x, y;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				finalmap[i][j] = 1;
			}
		}

		while (!qx.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			finalmap[x][y] = 0;
			int nx, ny;
			for (int i = 0; i < 4; i++) {
				nx = x + plusX[i];
				ny = y + plusY[i];
				if (nx < 0 || ny < 0 || nx >= R || ny >= C)
					continue;
				finalmap[nx][ny] = 0;
			}
		}

		//짝수이거나 1,3인 경우엔 여기서 걸러짐
		if (N == 1) {
			printfirst();
			System.out.println(sb);
			return;
		}
		if (N % 2 == 0) {
			printmiddle();
			System.out.println(sb);
			return;
		}
		if (N == 3) {
			printfinal();
			System.out.println(sb);
			return;
		}

		// 한번 터트리고 난 뒤 나머지가 1인 값 채우기
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (finalmap[i][j] == 1) {
					qx.add(i);
					qy.add(j);
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				firstmap[i][j] = 1;
			}
		}
		while (!qx.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			firstmap[x][y] = 0;
			int nx, ny;
			for (int i = 0; i < 4; i++) {
				nx = x + plusX[i];
				ny = y + plusY[i];
				if (nx < 0 || ny < 0 || nx >= R || ny >= C)
					continue;
				firstmap[nx][ny] = 0;
			}
		}

		// 한번 터트리고 난 뒤 나머지가 3인 부분 채우기
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (firstmap[i][j] == 1) {
					qx.add(i);
					qy.add(j);
				}
			}
		}
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				finalmap[i][j] = 1;
			}
		}
		while (!qx.isEmpty()) {
			x = qx.poll();
			y = qy.poll();
			finalmap[x][y] = 0;
			int nx, ny;
			for (int i = 0; i < 4; i++) {
				nx = x + plusX[i];
				ny = y + plusY[i];
				if (nx < 0 || ny < 0 || nx >= R || ny >= C)
					continue;
				finalmap[nx][ny] = 0;
			}
		}
		
		
		if(N%4 == 1) {
			printfirst();
		}
		if(N%4 == 3) {
			printfinal();
		}
		System.out.println(sb);
		
	}

	static void printfirst() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				switch (firstmap[i][j]) {
				case 0:
					sb.append(".");
					break;
				case 1:
					sb.append("O");
					break;
				}
			}
			sb.append("\n");
		}
	}

	static void printmiddle() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				switch (middlemap[i][j]) {
				case 0:
					sb.append(".");
					break;
				case 1:
					sb.append("O");
					break;
				}
			}
			sb.append("\n");
		}
	}

	static void printfinal() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				switch (finalmap[i][j]) {
				case 0:
					sb.append(".");
					break;
				case 1:
					sb.append("O");
					break;
				}
			}
			sb.append("\n");
		}
	}
}