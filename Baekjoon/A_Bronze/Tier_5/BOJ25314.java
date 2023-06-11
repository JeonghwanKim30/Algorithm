import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < (int)(N/4); i++){
            sb.append("long").append(" ");
        }
        sb.append("int");
        
        System.out.println(sb);
    }
}