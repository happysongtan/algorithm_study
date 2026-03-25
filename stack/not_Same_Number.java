import java.util.*;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int prev=-1;//이전값을 비교하기 위해 -1선언
         for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(num!=prev){//현재값과 이전값 비교
                list.add(num);
                prev=num;
                }
            }
//         list.add(arr[0]);
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]!=arr[i-1]){
//                 list.add(arr[i]);
//             }
//         }
        
        int[] answer = new int [list.size()];//배열을 리스트의 사이즈만큼 선언
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
    
        return answer;
    }
}
    
