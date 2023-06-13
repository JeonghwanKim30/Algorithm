import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long V = Integer.parseInt(st.nextToken());
		
		long diff = A-B;
		if((V-A)%diff == 0){
			System.out.println((V-A)/diff+1);
		}else
			System.out.println((V-A)/diff +2 );
			
		
	}
}