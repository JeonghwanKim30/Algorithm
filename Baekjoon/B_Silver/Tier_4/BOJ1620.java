import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		HashMap<String,Integer> map = new HashMap<>();

		int N = Integer.parseInt(st.nextToken());
		int ans = Integer.parseInt(st.nextToken());

		String arr[] = new String[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = br.readLine();
			map.put(arr[i],i);
		}

		String temp = null;
		int idx;
		for (int i = 0; i < ans; i++) {
			temp = br.readLine();
			try {
				idx = Integer.parseInt(temp);
				System.out.println(arr[idx]);
			} catch (Exception e) {
				System.out.println(map.get(temp));
			}
		}
	}
}