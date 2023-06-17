import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int heap[] = new int[200001];
	static int rear = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        //명령어의 갯수
		int N = Integer.parseInt(br.readLine());
		
        //명령어의 갯수만큼 반복
		for(int i = 0 ; i < N ; i++) {
			int com = Integer.parseInt(br.readLine());
			if(com == 0) {
				heapDelete();
			}else {
				heapAdd(com);
			}
		}
	}
    
    //힙 추가
	static void heapAdd(int com) {
		heap[++rear] = com;
		int temp;
		int idx = rear;
		while(true) {
			if(heap[idx] < heap[idx/2] || idx == 1) break;
			if(heap[idx] > heap[idx/2]) {
				temp = heap[idx/2];
				heap[idx/2] = heap[idx];
				heap[idx] = temp;
			}
			idx = idx/2;
		}
	}
	
    //힙 삭제
	static void heapDelete() {
        //비어있으면 0 출력
		if(rear==0){
			System.out.println(0);
			return;
		}
		
        //최댓값을 꺼내와서 출력
		int pop = heap[1];
		heap[1]=heap[rear];
		heap[rear--] = 0;
		System.out.println(pop);
        
		int temp;
		int idx = 1;
        //삭제 후 힙 정렬
		while(true) {
			if(heap[idx] < heap[idx*2] || heap[idx] < heap[idx*2 +1]) {
				temp = heap[idx];
				idx = heap[idx*2] >= heap[idx*2+1] ? idx*2 : idx*2 + 1;
				heap[idx/2] = heap[idx];
				heap[idx] = temp;
				continue;
			}
			break;
		}
		
	}
}