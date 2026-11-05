import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<operations.length;i++){
            String[] s=operations[i].split(" ");
            int num=Integer.parseInt(s[1]);
            if(s[0].equals("I")){
                minHeap.offer(num);
                maxHeap.offer(num);
            }else if(!minHeap.isEmpty()){
                if(num==1)minHeap.remove(maxHeap.poll());
                else maxHeap.remove(minHeap.poll());
            }
        }
        if(minHeap.isEmpty()){
            return new int[]{0,0};
        }
        int[] answer = new int []{maxHeap.peek(),minHeap.peek()};
        return answer;
    }
}
