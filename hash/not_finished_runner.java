import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map= new HashMap<>();
        HashMap<String, Integer> sap= new HashMap<>();
        String answer = "";
        for(int i=0;i<participant.length;i++){
            map.put(participant[i],map.getOrDefault(participant[i],0)+1);
        }
        for(int i=0;i<completion.length;i++){
            sap.put(completion[i],sap.getOrDefault(completion[i],0)+1);
        }
        for(int i=0;i<participant.length;i++){
            if(map.get(participant[i])==null || sap.get(participant[i])==null){
                return participant[i];
            }
            
            if(!map.get(participant[i]).equals(sap.get(participant[i]))){
                return participant[i];
            }
        }
        
        
        
        return answer;
    }
}