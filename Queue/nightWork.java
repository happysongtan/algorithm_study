import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<works.length;i++){
            pq.add(works[i]);
        }
        while(n>0){
            if(pq.peek()==0){
                break;
            }
            pq.add(pq.poll()-1);
            n--;
        }
        long answer=0;
        int length=pq.size();
        for(int i=0;i<length;i++){
            int num=pq.poll();
            answer=answer+num*num;
        }
        return answer;
    }
    
}
