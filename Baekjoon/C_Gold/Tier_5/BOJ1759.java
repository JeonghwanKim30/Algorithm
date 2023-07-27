import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Data{
		int Mnum;
		int Jnum;
		String arr[];
		
		public Data(int mnum, int jnum, int M) {
			super();
			Mnum = mnum;
			Jnum = jnum;
			this.arr = new String[M];
		}

		@Override
		public String toString() {
			String str = "";
			
			for(int i = 0 ; i < arr.length; i++) {
				str+= arr[i];
			}
			return str;
		}
		
	}
	
	//모음
	static LinkedList<String> moum = new LinkedList<>();
	
	
	static int len, total;
	static String arr[];
	
		public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		PriorityQueue<String> queue = new PriorityQueue<>(); 
		len = Integer.parseInt(st.nextToken());
		total = Integer.parseInt(st.nextToken());
		
		moum.add("a");
		moum.add("e");
		moum.add("i");
		moum.add("o");
		moum.add("u");
		
		
		//오름차순 정렬된 문자열 배열을 생성
		arr = new String[total];

		
		//문자열 정렬해서 배열에 집어넣음
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < total ; i++) {
			queue.add(st.nextToken());
		}
		int idx =0;
		
		while(!queue.isEmpty()) {
			arr[idx++] = queue.poll();
		}
		
		perm(0,0,null);
	}
	
	
	static void perm(int cnt, int start, Data data) {
		if(cnt >= len) {
			if(data.Jnum >=2 && data.Mnum >=1) {
				System.out.println(data.toString());
			}
			return;
		}
		
		if(cnt == 0) {
			Data temp = new Data(0, 0, len);
			data = temp;
		}
		
		for(int i = start ; i < total; i++) {
			data.arr[cnt] = arr[i];
			if(moum.contains(arr[i])) {
				data.Mnum++;
			}else {
				data.Jnum++;
			}
			perm(cnt+1,i+1,data);
			if(moum.contains(arr[i])) {
				data.Mnum--;
			}else {
				data.Jnum--;
			}
		}
		
		return;
	}
}