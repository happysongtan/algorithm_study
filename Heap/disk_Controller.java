import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
    
        PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->{
            if(a[1]!=b[1])return a[1]-b[1];
            return a[0]-b[0];
            
            });
        int sum=0;
        int index=0;
        int time=0;
        while(index<jobs.length||!queue.isEmpty()){
            while(index<jobs.length&&jobs[index][0]<=time){
            queue.offer(new int[] {jobs[index][0],jobs[index][1]});
            index++;
            }
            if(!queue.isEmpty()){
                int [] cur=queue.poll();
                time+=cur[1];
                sum=sum+time-cur[0];
            }else{
                time++;
            }
        }
        return sum/jobs.length;
    }
}
