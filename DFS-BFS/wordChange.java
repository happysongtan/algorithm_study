import java.util.*;
class Solution {
    public void canConvert(Queue <Object[]>queue, Object[] current, boolean [] visited,String[] words){
        String word=(String)current[0];
        int count=0;
        char[] arr = word.toCharArray();
        for(int i=0;i<words.length;i++){
            count=0;
            char[] target_char = words[i].toCharArray();
            for(int j=0;j<arr.length;j++){
            if(arr[j]!=target_char[j]){
                count++;
            }
            if(count==2){break;}
     }
        if(visited[i]==false&&count==1){
            queue.offer(new Object[]{words[i],(int)current[1]+1});
            visited[i]=true;
             }        
   }          

}
    public int solution(String begin, String target, String[] words) {
        Queue <Object[]>queue =new LinkedList<>();
        boolean [] visited =new boolean[words.length];
        queue.offer(new Object[]{begin,0});
        while(!queue.isEmpty()){
            Object[] current= queue.poll();
            String word=(String)current[0];
            int count=(int)current[1];
            if(word.equals(target)){
                return count;
            }else{
                canConvert(queue,current,visited,words);
            }         
        }
        int answer = 0;
        return answer;
    }
}
