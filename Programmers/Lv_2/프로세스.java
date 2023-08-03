import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
                public int compare(Integer o1, Integer o2){
                    return o2-o1;
                }
            }
        );
        
        for(int i = 0 ; i < priorities.length; i++){
            pq.add(priorities[i]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i < priorities.length; i++){
            q.add(priorities[i]);
        }
        
        int idx = location;
        int answer = 0;
        
        int max = pq.poll();
        while(true){
            int now = q.poll();
            if(idx==0){
                if(now == max){
                    answer++;
                    break;
                }else{
                    q.add(now);
                    idx = pq.size();
                }
            }else{
                if(now == max){
                    max = pq.poll();
                    answer++;
                }else{
                    q.add(now);
                }
                idx--;
            }
            
        }
        
        return answer;
    }
}