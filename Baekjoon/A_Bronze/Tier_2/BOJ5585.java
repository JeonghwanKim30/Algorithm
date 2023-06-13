import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pay = Integer.parseInt(br.readLine());
		int payback = 1000 - pay;
		int cnt = 0;
		int sum = 0;
		while(payback - sum >= 500) {sum += 500; cnt++;}
		while(payback - sum >= 100) {sum += 100; cnt++;}
		while(payback - sum >= 50) {sum += 50; cnt++;}
		while(payback - sum >= 10) {sum += 10; cnt++;}
		while(payback - sum >= 5) {sum += 5; cnt++;}
		while(payback - sum >= 1) {sum += 1; cnt++;}
		System.out.println(cnt);
	}
}