import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        for(int i=0;i<citations.length/2;i++){
            int temp=citations[i];
            citations[i]=citations[citations.length-1-i];
            citations[citations.length-1-i]=temp;
        }
        for(int i=citations.length;i>0;i--){
            int count=0;
            for(int j=0;j<citations.length;j++){
                if(i<=citations[j]){
                    count++;
                } 
            }
            if(count>=i){
                return i;
            }    
        }
        return 0;
    }
}
