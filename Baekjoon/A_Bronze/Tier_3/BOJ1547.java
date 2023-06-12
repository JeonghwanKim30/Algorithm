import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int n = Integer.parseInt(br.readLine());
    	
    	int arr[]= new int[] {0,1,0,0};
    	
    	int temp,from,to;
    	for(int i = 0 ; i < n ; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		from = Integer.parseInt(st.nextToken());
    		to = Integer.parseInt(st.nextToken());
    		
    		if(arr[from] == 0 && arr[to] == 0) continue;
    		temp = arr[from];
    		arr[from] = arr[to];
    		arr[to] = temp;
    	}
    	
    	for(int i =1 ; i <=3; i++) {
    		if(arr[i] == 1) {System.out.println(i); break;}
    	}
    }
}