import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer>list=new ArrayList<>();
         ArrayList<Integer>arr_Answer=new ArrayList<>();
        for(int i=0;i<speeds.length;i++){
            list.add(((100-progresses[i])+speeds[i]-1)/speeds[i]);            
        }
        int target = list.get(0);
        int count = 1;
        for(int i = 1; i < list.size(); i++){
            if(list.get(i) <= target){
                count++;
            } else {
                arr_Answer.add(count);
                target = list.get(i);
                count = 1;
            }
        }
        arr_Answer.add(count); 
        int[] answer=new int[arr_Answer.size()];
        for(int i=0;i<arr_Answer.size();i++){
            answer[i]=arr_Answer.get(i);
            System.out.print(answer[i]);
        }
        return answer;
    }
}
