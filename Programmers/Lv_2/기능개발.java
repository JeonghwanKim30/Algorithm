import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        int head = 0;

        while(head < progresses.length){

            int count = 0;

            for(int i = head; i < progresses.length; i++){
                progresses[i] += speeds[i];
            }

            while(true){
                if(head < progresses.length && progresses[head] >= 100 ){
                    head++;
                    count++;
                    continue;
                }
                break;
            }

            if(count!=0)
                answer.add(count);
        }

        return answer;
    }
}