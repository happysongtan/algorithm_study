import java.util.*;
class Solution {
    public int dfs(int index, int sum,int [] numbers,int target){
        if(index==numbers.length){
            if(sum==target) return 1;
            return 0;
        }
        int plus;
        int minus;
        plus=dfs(index+1,sum+numbers[index],numbers,target);
    
        minus=dfs(index+1,sum-numbers[index],numbers,target);
        return plus+minus;
        }    
    public int solution(int[] numbers, int target) {
        
        int answer = 0;
        answer=dfs(0,0,numbers,target);
        return answer;
    
    }
}
