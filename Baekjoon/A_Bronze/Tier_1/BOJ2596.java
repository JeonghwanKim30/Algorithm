import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
		String array[] = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"};
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		String answer = "";
		for(int i= 0 ; i < N ; i++) {
			String sum = "";
			for(int j = 0 ; j< 6 ; j++) {
				sum+=s.charAt(6*i+j); //6개씩 끊어서 문자열 만듦
			}
			
			for(int x = 0 ; x < 9; x++) {
				if(x == 8) { //x가 8이 되면 발견하지 못했음
					for(int a = 0; a < 9; a++) {
						if(a==8) { //a가 8이 되면 발견 하지 못했으므로 현재 index를 출력
							System.out.println(i+1);
							return;
						}
						int diff = 0; //받은 문자와 대조해서 다른 비트가 몇갠지 저장
						for(int b = 0 ; b<6 ; b++) { if(sum.charAt(b) != array[a].charAt(b)) diff++; } //6비트씩 끊어서 다른 비트 수를 검출
						if(diff ==1 ) {answer += (char)(a+65); break;} //루프를 돌아서 diff가 1인 문자가 있다면 answer에 더하고 반복 탈출
					}
					break;
				}
				if(sum.equals(array[x])) {
					answer += (char)(x+65); //같은 문자가 있다면 문자로 치환하고 answer에 더해줌
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
