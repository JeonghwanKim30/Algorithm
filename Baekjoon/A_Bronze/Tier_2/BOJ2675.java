import java.util.Scanner;

public class Main{
     public static void main(String[] args){
         
         Scanner sc = new Scanner(System.in);
         int N = sc.nextInt();
         
         sc.nextLine();
         
         String[] strarr = new String[N];
         for(int i =0 ; i<N ; i++){
             strarr[i] = sc.nextLine();	
         }
         
         for(int i = 0 ; i < N ; i++ ) {
             String[] splitarr = strarr[i].split(" ");
             for(int j = 0; j < splitarr[1].length(); j++){
	             for(int k = 0; k < Integer.parseInt(splitarr[0]) ; k++){
	                 System.out.printf("%c",splitarr[1].charAt(j));
	             }
             }
             System.out.println();
         }
     }      
}