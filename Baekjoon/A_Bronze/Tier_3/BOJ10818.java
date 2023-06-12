import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max =  -1000000;
        int min = 10000000;
        int temp;
        for(int i = 0 ; i < n ; i++){
            temp = sc.nextInt();
            if(temp > max) max = temp;
            if(temp < min) min = temp;
        }
        System.out.println(min +" " + max);
    }
}