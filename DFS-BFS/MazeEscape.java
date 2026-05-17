import java.util.*;
class Solution {
    public int bfs(int startX,int startY,String[] maps,char target){
        
        int mapX=maps.length;
        int mapY=maps[0].length();
        Queue<int[]> queue=new ArrayDeque<>();
        queue.offer(new int []{startX,startY,0});
        boolean[][] visited= new boolean[mapX][mapY];
        visited[startX][startY]=true;
        int[] X={1,-1,0,0};
        int[] Y={0,0,1,-1};
        while(!queue.isEmpty()){
            int [] current=queue.poll();
            int cx=current[0];
            int cy=current[1];
            int count=current[2];
            if(maps[cx].charAt(cy)==target){
                return count;
            }
            for(int i=0;i<4;i++){
                int nx=cx+X[i];
                int ny=cy+Y[i];
                if(nx>=0&&nx<mapX&&ny>=0&&ny<mapY&&maps[nx].charAt(ny)!='X'&&visited[nx][ny]==false){
                    visited[nx][ny]=true;
                    queue.offer(new int[]{nx,ny,count+1});
                }
                
            }
        }    
        return -1;
    }
    public int solution(String[] maps) {
        int startX=0;
        int startY=0;
        int leverX=0;
        int leverY=0;
        for(int i=0;i<maps.length;i++){
            for(int j=0;j<maps[0].length();j++){
                if(maps[i].charAt(j)=='S'){
                    startX=i;
                    startY=j;
                }
                if(maps[i].charAt(j)=='L'){
                    leverX=i;
                    leverY=j;
                }  
            }
        }
       
        int count=bfs(startX,startY,maps,'L');
        if(count==-1){
            return count;
        }
        int lcount=bfs(leverX,leverY,maps,'E');
        if(lcount==-1){
            return lcount;
        }
        count=count+lcount;
        
        return count;
    }
}
