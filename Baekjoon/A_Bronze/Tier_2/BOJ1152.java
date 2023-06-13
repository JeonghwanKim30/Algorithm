import java.util.Scanner;

public class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int len = 0;
        for(int i = 0 ; i < arr.length; i++) {
        	if(arr[i].length()!=0) {len++;}
        }
        System.out.println(len);
    }
}