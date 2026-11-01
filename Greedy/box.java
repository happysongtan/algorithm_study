import java.util.*;
class Solution {
    
    public int solution(int[] order) { 
        Stack<Integer> st= new Stack<>();
        int i=0;
        for(int box=1;box<=order.length;box++){
            st.push(box);
            while(!st.isEmpty()&&st.peek()==order[i]){
                st.pop();
                i++;
                
            }
        }
        
        return i;
    }
}
