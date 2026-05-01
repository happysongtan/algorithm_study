import java.util.*;
class Solution {
    public void ChangeAlpabet(char[] sentence){
        boolean isStart=true;
        for(int i =0;i<sentence.length;i++){
            if(sentence[i]==' '){
                isStart=true;
                continue;
            }
            if(isStart==true){
                if(sentence[i]>=97&&sentence[i]<=122){
                    sentence[i]=(char)(sentence[i]-32);
                    isStart=false;    
                }else{
                    isStart=false;    
                }
                
            }else if(sentence[i] >= 'A' && sentence[i] <= 'Z'){
                 sentence[i] = (char)(sentence[i] + 32);
             }
            
        }
        
        
    }
    public String solution(String s) {
        char [] sentence=s.toCharArray();
        ChangeAlpabet(sentence);  
        String answer = new String(sentence);
        return answer;
    }
}
