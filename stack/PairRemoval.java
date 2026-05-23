import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> st=new Stack<>();
        char [] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                st.add(arr[i]);
            }else if(st.peek()==arr[i]){
                st.pop();
            }else{
                st.add(arr[i]);
            }
        }
        if(st.isEmpty()){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}
