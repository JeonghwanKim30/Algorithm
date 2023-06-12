import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute >= 45){
            System.out.printf("%d %d",hour, minute-45);
        }
        if(minute < 45 && hour >0){
            System.out.printf("%d %d",hour-1, 60+(minute-45));
        }
        if(minute < 45 && hour ==0){
            System.out.printf("%d %d",23, 60+(minute-45));
        }
    }
}
