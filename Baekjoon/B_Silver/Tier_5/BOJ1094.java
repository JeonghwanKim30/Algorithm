import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int N = Integer.parseInt(br.readLine());
    	int sum = 0;
    	while(true) {
    		if(N == 0) break;
    		if(N%2==1) {
    			sum++;
    			N -=1;
    		}
    		N /=2;
    	}
    	System.out.println(sum);
	}
}