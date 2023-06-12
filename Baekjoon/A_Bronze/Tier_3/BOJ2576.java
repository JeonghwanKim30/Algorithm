import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	int sum = 0;
    	int min = Integer.MAX_VALUE;
    	
    	for(int i = 0 ; i < 7 ; i++) {
    		int temp = Integer.parseInt(br.readLine());
    		if(temp%2 == 1) {
    			sum+=temp;
    			if(min > temp) min = temp;
    		}
    	}
    	
    	if(sum==0) {
    		System.out.println(-1);
    	}else {
    		System.out.println(sum);
    		System.out.println(min);
    	}
    	
	}
}