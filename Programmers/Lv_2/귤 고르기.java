import java.util.PriorityQueue;
import java.util.Comparator;
	
class Solution {
    public int solution(int k, int[] tangerine) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(
			) {
				public int compare(Integer o1, Integer o2) {
					return o2-o1;
				}
	    });
        
        int answer = 0;
        
        int len = tangerine.length;
        
        int arr[] = new int[10000001];
        
        for(int i = 0 ; i < len; i++) {
        	arr[tangerine[i]]++;
        }
        
        for(int i = 1 ; i < 10000001; i++) {
        	if(arr[i]!=0) {
        		pq.add(arr[i]);
        	}
        }
        int sum = 0;
        while(sum<k) {
        	int n = pq.poll();
        	sum += n;
        	answer++;
        }
        
        return answer;
    }
}