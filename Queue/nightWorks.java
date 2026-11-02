import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int w: works)pq.offer(w);
        for(int i=0;i<n;i++){
            int max=pq.poll();
            if(max==0) return 0;
            pq.offer(max-1);
        }
        long answer = 0;
        for(int w: pq) answer+=w*w;
        return answer;
    }
}
