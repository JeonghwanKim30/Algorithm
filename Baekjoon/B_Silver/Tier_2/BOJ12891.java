import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int totalLen = Integer.parseInt(st.nextToken());
		int targetLen = Integer.parseInt(st.nextToken());
		int number = 0;
		
		String str = br.readLine();
		
		HashMap<Character, Integer> target = new HashMap<>();
		HashMap<Character, Integer> now = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		
		target.put('A', Integer.parseInt(st.nextToken()));
		target.put('C', Integer.parseInt(st.nextToken()));
		target.put('G', Integer.parseInt(st.nextToken()));
		target.put('T', Integer.parseInt(st.nextToken()));

		now.put('A', 0);
		now.put('C', 0);
		now.put('G', 0);
		now.put('T', 0);

		
		for(int i = 0 ; i < targetLen; i++) {
			now.replace(str.charAt(i), now.get(str.charAt(i))+1);
		}
		
		for(int i = 0; i < 1 ; i++) {
			if(target.get('A') > now.get('A')) continue;
			if(target.get('C') > now.get('C')) continue;
			if(target.get('G') > now.get('G')) continue;
			if(target.get('T') > now.get('T')) continue;
			number++;
		}
		
		for(int i = 1 ; i <= totalLen-targetLen; i++) {
			now.replace(str.charAt(i-1), now.get(str.charAt(i-1))-1);
			now.replace(str.charAt(i+targetLen-1), now.get(str.charAt(i+targetLen-1))+1);
			if(target.get('A') > now.get('A')) continue;
			if(target.get('C') > now.get('C')) continue;
			if(target.get('G') > now.get('G')) continue;
			if(target.get('T') > now.get('T')) continue;
			number++;
		}
		System.out.println(number);
	}
}