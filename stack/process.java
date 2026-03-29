import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue=new LinkedList<>();      
        int count=0;
        
        for(int i=0;i<priorities.length;i++){
            queue.offer(new int[]{i,priorities[i]});
        }
        while(true){
     
            int[] target=queue.poll();
            boolean hasHigher=false;
            for(int[]q:queue){
                if(q[1]>target[1]){
                    hasHigher=true;
                    break;
                }
            }
            if(hasHigher){
                queue.offer(target);
            }else{
                count++;
                if(target[0]==location){
                     return count;
            }
            }

        }
    }
}
