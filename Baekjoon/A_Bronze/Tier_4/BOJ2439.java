import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-1-i; j++){
                System.out.printf(" ");
            }
            for(int k = 0 ; k <= i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}