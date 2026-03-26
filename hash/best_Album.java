import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
    
         HashMap<String, Integer> map= new HashMap<>();
        for(int i=0;i<plays.length;i++){
            map.put(genres[i],map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        HashMap<String,List<int[]>> songs=new HashMap<>();
        for(int i=0;i<plays.length;i++){
            if(!songs.containsKey(genres[i])){
                songs.put(genres[i],new ArrayList<>());
            }              
            songs.get(genres[i]).add(new int[]{i,plays[i]});
        }
                List<Integer> result = new ArrayList<>();
        List<String> genreList=new ArrayList<>(map.keySet());  
        genreList.sort((a,b)-> map.get(b)-map.get(a));      
        for(String genre:genreList){
            List<int[]>list=songs.get(genre);
            list.sort((a,b)->{
               if(b[1]==a[1])return a[0]-b[0];
                return b[1]-a[1];
            });
            int count = 0;
          for(int[] song : list){
             if(count == 2) break;
              result.add(song[0]);
                 count++;
            }   
        }

         int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}
