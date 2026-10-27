import java.util.*;
class Solution {
    Deque<String>dq=new ArrayDeque<>();
    public int solution(int cacheSize, String[] cities) {    
        if(cacheSize==0) return cities.length*5;
        Deque<String> dq = new ArrayDeque<>();
        int answer=0;
        for(int i=0;i<cities.length;i++){
            String city=cities[i].toLowerCase();
            if(dq.remove(city)){
                dq.add(city);
                answer+=1;
            }else{
                if(dq.size()==cacheSize){
                    dq.poll();
                }
                dq.add(city);
                answer+=5;
            }
        }
        return answer;
    
    }
}
