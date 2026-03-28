import java.util.*;
class Solution {
    boolean solution(String s) {
        int stack=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)==('(')){
                stack++;
            }
            else if(s.charAt(i)==(')')){
                stack--;
                if(stack<0){
                    return false;
                }
            }
        }
        if(stack==0){
            return true;
            }else{
            return false;
        }
        
    
    }
}
