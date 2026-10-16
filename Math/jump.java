import java.util.*;
public class Solution {
    public int solution(int n) {
        int ans = 0;
        int count=0;
        while(n>0){
            if(n%2!=0){
                count++;
                n=n-1;
            }else{
                n=n/2;
            }
        }

        return count;
    }
}
