import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1, x2, y1, y2;
		int xans, yans;
		x1 = Integer.parseInt(st.nextToken());
		y1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		x2 = Integer.parseInt(st.nextToken());
		y2 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		if(x1==x2) { xans = Integer.parseInt(st.nextToken());}
		else{xans = x1+x2 - Integer.parseInt(st.nextToken());}
		if(y1==y2) { yans = Integer.parseInt(st.nextToken());}
		else{yans = y1+y2 - Integer.parseInt(st.nextToken());}
		System.out.printf("%d %d",xans,yans);
	}
}
