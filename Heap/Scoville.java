import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> queue= new PriorityQueue<>();
        int one;
        int count=0;
        for(int i=0;i<scoville.length;i++){
            queue.offer(scoville[i]);
        }
        while(queue.peek()<K&&!queue.isEmpty()){
            if(queue.size()==1){
                return -1;
            }
            else{
                one=queue.poll();
                queue.offer(one+queue.poll()*2);
                count++;
            }
        }
        System.out.print(count);
        return count;
    }
}
