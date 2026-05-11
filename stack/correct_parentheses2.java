import java.util.*;
import java.io.*;
class Solution {
    public boolean isValid(String s) {
        Deque<Character>stack= new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty()){
                if(stack.peek()=='('&&s.charAt(i)==')'){
                    stack.pop();
                    continue;
                }else if(stack.peek()=='['&&s.charAt(i)==']'){
                    stack.pop();
                    continue;
                }else if(stack.peek()=='{'&&s.charAt(i)=='}'){
                    stack.pop();
                    continue;
                }else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
                    return false;
                    
                }
            }
            stack.push(s.charAt(i));
            
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
