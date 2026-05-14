import java.util.*;
class Solution {
    public void bfs(ArrayList<Integer>[]graph,boolean[]visited,int[] distance){
        Queue<Integer>queue=new ArrayDeque<>();
        queue.offer(1);
        visited[1]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            for(int next:graph[current]){
                if(!visited[next]){
                    visited[next]=true;
                    distance[next]=distance[current]+1;
                    queue.offer(next);
                }
            }
        }
        //다음번 노드가 visited 확인하고 visited면 이동 아니면 넘어가
    }
    public int solution(int n, int[][] edge) {
        int[] distance = new int[n + 1];
        ArrayList<Integer>[] graph=new ArrayList[n+1];
        boolean [] visited=new boolean[n+1];
        for(int i=0;i<=n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge.length;i++){
            int a=edge[i][0];
            int b=edge[i][1];
            graph[a].add(b);
            graph[b].add(a);
        }
        bfs(graph, visited, distance);
        int answer = 0;
        int max=0;
        for(int i=0;i<distance.length;i++){
            if(max<distance[i]){
                max=distance[i];
            }
        }
        for(int i=0;i<distance.length;i++){
            if(max==distance[i]){
                answer++;
            }
        }
        
        return answer;
    }
}
