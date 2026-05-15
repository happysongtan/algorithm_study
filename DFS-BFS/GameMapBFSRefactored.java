import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int mapX=maps.length;
        int mapY=maps[0].length;
        
        boolean [][] visited=new boolean[mapX][mapY];
        int[] X= new int[]{1,-1,0,0};
        int[] Y=new int[]{0,0,1,-1};
        Queue<int[]> queue=new ArrayDeque<>();
        queue.offer(new int[]{0,0,1});
        visited[0][0]=true;
        while(!queue.isEmpty()){
            int[] current=queue.poll();
            int cx=current[0];
            int cy=current[1];
            int count=current[2];
            if(cx==mapX-1&&cy==mapY-1){
                return count;
            }
            for(int i=0;i<4;i++){
                int nx=cx+X[i];
                int ny=cy+Y[i];
                if(nx>=0&&nx<mapX&&ny>=0&&ny<mapY&&maps[nx][ny]==1&&visited[nx][ny]==false){
                    visited[nx][ny]=true;
                    queue.offer(new int[]{nx,ny,count+1});
                }
            }
            
        }
        
        return -1;
    }
}
