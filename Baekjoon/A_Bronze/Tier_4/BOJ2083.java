import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	while(true) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		
    		String temp = st.nextToken();
    		int age = Integer.parseInt(st.nextToken());
    		int weight = Integer.parseInt(st.nextToken());
    		
    		if(temp.equals("#")) break;
    		
    		sb.append(temp).append(" ");
    		if(age>17 || weight >=80){
    			sb.append("Senior").append("\n");
    		}else {
    			sb.append("Junior").append("\n");
    		}
    	}
    	
    	System.out.println(sb);
    }
}