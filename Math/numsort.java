import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int index=0;
        int num=0;
        int sum=0;
        while(num<10){
            if(index<numbers.length&&numbers[index]==num){
                index++;
            }else{
                sum+=num;
                
            }
            num++;
        }
        return sum;
    }
}
