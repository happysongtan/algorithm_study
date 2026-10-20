import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String,Integer> map=new HashMap<>();
        Map<String,Integer> set=new HashMap<>();
        int window=0;
        int count=0;
        for(int i=0;i<number.length;i++){
            set.put(want[i],number[i]);
            map.put(want[i],0);
        }
        for(int i=0;i<discount.length;i++){
            if(window<10){
                if (map.containsKey(discount[i])) {
                    map.put(discount[i], map.get(discount[i]) + 1);
                }
                window++;
            }else{
                String out = discount[i - 10];
                if (map.containsKey(out)) {
                    map.put(out, map.get(out) - 1);
                }
                if (map.containsKey(discount[i])) {
                    map.put(discount[i], map.get(discount[i]) + 1);
                }
                
            
            }
            
            if (window == 10 && map.equals(set)) {
                count++;
                }
        }
        
        return count;
    }
}
