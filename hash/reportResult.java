import java.util.*;
import java.io.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int [id_list.length];
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<report.length;i++){
            set.add(report[i]);
        }
        String[] reporter=new String[set.size()];
        String[] reportedUser=new String[set.size()];
        int j=0;
        for(String s:set){
            String[]arr=s.split(" ");
            reporter[j]=arr[0];
            reportedUser[j]=arr[1];
            j++;
        }
        HashMap<String,Integer> hashmap=new HashMap<>();
        HashMap<String,Integer> mailCount=new HashMap<>();
        for(int i=0;i<set.size();i++){
            hashmap.put(reportedUser[i],hashmap.getOrDefault(reportedUser[i],0)+1);
        }
        
        for(int i=0;i<set.size();i++){
            if(hashmap.get(reportedUser[i]) >= k){
                mailCount.put(reporter[i], mailCount.getOrDefault(reporter[i], 0) + 1);
            }
        }
        for(int i=0;i<id_list.length;i++){
             answer[i] = mailCount.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}
