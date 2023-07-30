import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Main {

	//false면 정방향, true면 역방향
	static boolean flag;
	
	static ArrayList<Integer> arr;
	static int start, last;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());
		
		for(int T = 1 ; T <= TC ; T++) {
			String str[];
			flag = false;
			
			arr = new ArrayList<>();
			
			//매 시행마다 출력문 초기화
			StringBuilder sb = new StringBuilder();
			
			sb.append("[");
			
			//명령어 입력 받기
			str = br.readLine().split("");
			
			//숫자의 갯수
			int N = Integer.parseInt(br.readLine());
			
			start = 0 ;
			last = N;
			
			String st = br.readLine().replace("[", "").replace("]", "");
			
			String temp[] = st.split(",");
			for(int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(temp[i]));
			}
			
			//명령어 수행
			for(int i = 0 ; i < str.length; i++) {
				switch(str[i]) {
				case "R":
					flag = !flag;
					break;
				case "D":
					//비울 명령어가 없다면 그냥 끝내고 error 출력
					if(start == last) {
						last--;
						i = str.length;
						sb = new StringBuilder();
						sb.append("error");
						break;
					}
					//정방향
					if(!flag) {
						start++;
					}
					//역방향
					if(flag) {
						last--;
					}
					break;
				}
			}
			
			if(start == last) {
				System.out.println("[]");
				continue;
            }
			
			//정방향
			if(!flag) {
				for(int i = 0; i <last-start; i++) {
					sb.append(arr.get(start+i));
					if( i!=last-start-1) sb.append(",");
				}
			}
			//역방향
			if(flag) {
				for(int i = 0; i <last-start; i++) {
					sb.append(arr.get(last - i-1));
					if( i!=last-start-1) sb.append(",");
				}
			}
			
			if(sb.toString().equals("error")) {
				System.out.println(sb);
				continue;
			}
			
			sb.append("]");
			
			//출력하기
			System.out.println(sb);
		}
	}
}