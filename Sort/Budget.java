import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] d, int budget){
        Arrays.sort(d);
        int sum=0;
        for(int i=0;i<d.length;i++){
            sum+=d[i];
            if(sum>budget){
                return i;
            }
            
        }
        int answer = d.length;
        return answer;
    }
}
