import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long K = Long.parseLong(st.nextToken());
        Long P = Long.parseLong(st.nextToken());
        Long N = Long.parseLong(st.nextToken());

        Queue<Long> queue = new LinkedList<>();

        Long modArr[] = new Long[31];
        boolean check[] = new boolean[31];
        
        while(N!=0){
            queue.add(N%2);
            N/=2;
        }

        int idx = 1;
        while(!queue.isEmpty()){
        	if(queue.poll()==1) {
        		check[idx++] = true;
        	}else {
        		check[idx++] = false;
        	}
        }
        
        modArr[0] = 1L;
        modArr[1] = (P)%1000000007L;
        
        for(int i = 2 ; i <= 30; i++){
            modArr[i] = (modArr[i-1]*modArr[i-1])%1000000007L;
        }

        Long rst=K;
        for(int i = 0; i <= 30; i++){
            if(check[i]){
                rst = (rst*modArr[i])%1000000007L;
            }
        }

        System.out.println(rst);
    }
}