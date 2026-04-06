import java.util.*;
class Solution {
    public void calcDistance(Queue<int[]> distQueue,int []value,boolean[][]visited,int[][] maps){       
            if(value[0]+1<maps.length){
                if (maps[value[0]+1][value[1]]==1&&visited[value[0]+1][value[1]]==false){
                    visited[value[0]+1][value[1]]=true;
                    distQueue.offer(new int[]{value[0]+1,value[1],value[2]+1});
                }
            }
            if(value[0]-1>=0){
                if (maps[value[0]-1][value[1]]==1&&visited[value[0]-1][value[1]]==false){
                    visited[value[0]-1][value[1]]=true;
                    distQueue.offer(new int[]{value[0]-1,value[1],value[2]+1});
                    }
                }
            if(value[1]+1<maps[0].length){
                if (maps[value[0]][value[1]+1]==1&&visited[value[0]][value[1]+1]==false){
                    visited[value[0]][value[1]+1]=true;
                    distQueue.offer(new int[]{value[0],value[1]+1,value[2]+1});
                    }
                }
            if(value[1]-1>=0){
                if (maps[value[0]][value[1]-1]==1&&visited[value[0]][value[1]-1]==false){
                    visited[value[0]][value[1]-1]=true;
                    distQueue.offer(new int[]{value[0],value[1]-1,value[2]+1});
                    }
               }

        }

    public int solution(int[][] maps) {
        Queue <int[]> distQueue=new LinkedList<>();
        boolean [][] visited=new boolean[maps.length][maps[0].length];
        distQueue.offer(new int[]{0,0,1});
        visited[0][0]=true;
      
        while(!distQueue.isEmpty()){
            int [] value=distQueue.poll();
            if(value[0]==maps.length-1&&value[1]==maps[0].length-1){
                return value[2];
            }else{
                calcDistance(distQueue,value,visited,maps);
                }
        }
        
        int answer = -1;
        return answer;
    }
}
    
