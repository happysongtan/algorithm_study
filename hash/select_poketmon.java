import java.util.*;
class Solution {
    public int solution(int[] nums) {
//     HashMap<Integer, Integer> map=new HashMap<>();
//         for(int i : nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }
//         if(nums.length/2<=map.size()){
//             return nums.length/2;
//             }else{
//             return map.size();
//         }

//     }
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        return Math.min(set.size(),nums.length/2);
    }
}