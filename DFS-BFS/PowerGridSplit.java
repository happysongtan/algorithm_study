import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer=Integer.MAX_VALUE;
        for(int i=0;i<wires.length;i++){
            ArrayList<Integer>[]arr=new ArrayList[n+1];
            boolean []visited=new boolean[n+1];
            for(int j=0;j<n+1;j++){
                arr[j]=new ArrayList<>();
            }
            for(int j=0;j<wires.length;j++){
                if(i==j){
                    continue;
                }
                int a=wires[j][0];
                int b=wires[j][1];
                arr[a].add(b);
                arr[b].add(a);
            }
            int count=dfs(1,visited,arr);
            int other=n-count;
            int abs=Math.abs(count-other);
            answer=Math.min(abs,answer);
            
        }       
        
        return answer;
    }
    public int dfs(int current,boolean[]visited,ArrayList<Integer>[]arr){
        visited[current]=true;
        int count=1;
        for(int i=0;i<arr[current].size();i++){
            int next=arr[current].get(i);
            if(!visited[next]){
                count=count+dfs(next,visited,arr);
            }
        }      
        return count;
    }
}
