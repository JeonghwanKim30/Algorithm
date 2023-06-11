import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int total = 0;
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int price = sc.nextInt();
            int num = sc.nextInt();
            total += price*num;
        }
        if(total == money){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}