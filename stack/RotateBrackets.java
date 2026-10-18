import java.util.*;
class Solution {
    public int solution(String s) {
       
        int count=0;
        for(int i=0;i<s.length();i++){
            int j=isValid(s.substring(i) + s.substring(0, i));
            if(j==1){
                count++;
            }
        }
        return count;
    }
    public int isValid(String str){
         char[] arr=str.toCharArray();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='{'||arr[i]=='['||arr[i]=='('){
                st.add(arr[i]);
            }else if(st.size()!=0 && ((st.peek()=='(' && arr[i]==')') ||(st.peek()=='[' && arr[i]==']') ||(st.peek()=='{' && arr[i]=='}'))){
                st.pop();
            }else{
                return 0;
            }
        }
        if(st.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
    
}
