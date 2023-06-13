import java.util.*;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[4];
        int min = 4;
        for(int i = 0 ; i < N ; i++){
            String str = sc.next();
            int in = sc.nextInt();
            if(in < min) min = in ;
            arr[in-1] = str;
        }
        	System.out.println(arr[min -1]);
        
    }
}