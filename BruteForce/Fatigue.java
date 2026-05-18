import java.util.*;
class Solution {
    int answer = 0;
    public void dfs(int k, int[][]dungeons,boolean[]visited,int count){
        answer=Math.max(answer,count);
        for(int i=0;i<dungeons.length;i++){
            if(visited[i]==false&&dungeons[i][0]<=k){
                visited[i]=true;
                dfs(k-dungeons[i][1],dungeons,visited,count+1);
                visited[i]=false;
            }
        }
        
    }
    public int solution(int k, int[][] dungeons) {
        boolean[] visited=new boolean[dungeons.length];
        dfs(k,dungeons,visited,0);
        
        
        return answer;
    }
}// 1 2 3 //1 3 2// 2 1 3 //2 3 2 //3 1 2// 3 2 1
