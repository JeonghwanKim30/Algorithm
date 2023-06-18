import java.util.*;
import java.io.*;


public class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long C = Long.parseLong(st.nextToken());

        Queue<Long> queue = new LinkedList<>();

        Long modArr[] = new Long[41];
        boolean check[] = new boolean[41];
        
        while(B!=0){
            queue.add(B%2);
            B/=2;
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
        modArr[1] = A%C;
        
        for(int i = 2 ; i <= 40; i++){
            modArr[i] = (modArr[i-1]*modArr[i-1])%C;
        }

        Long rst=1L;
        for(int i = 0; i <= 40; i++){
            if(check[i]){
                rst = (rst*modArr[i])%C;
            }
        }

        System.out.println(rst);
    }
}