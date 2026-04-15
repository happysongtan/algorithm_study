import java.util.*;
class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        boolean [][] visited=new boolean[101][101];
        boolean [][] canGo=new boolean[101][101];
        for (int i = 0; i < rectangle.length; i++) {
        int x1 = rectangle[i][0] * 2;
        int y1 = rectangle[i][1] * 2;
        int x2 = rectangle[i][2] * 2;
        int y2 = rectangle[i][3] * 2;
        for (int y = y1; y <= y2; y++) {
            for (int x = x1; x <= x2; x++) {
                canGo[x][y] = true;
                }
            }
        }

        for (int i = 0; i < rectangle.length; i++) {
            int x1 = rectangle[i][0] * 2;
            int y1 = rectangle[i][1] * 2;
            int x2 = rectangle[i][2] * 2;
            int y2 = rectangle[i][3] * 2;
            for (int y = y1 + 1; y < y2; y++) {
                for (int x = x1 + 1; x < x2; x++) {
                    canGo[x][y] = false;
                    }
                }   
            }
        visited[characterX*2][characterY*2]=true;
        Queue<int[]>queue=new LinkedList<>();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        characterX=characterX*2;
        characterY=characterY*2;
        itemX=itemX*2;
        itemY=itemY*2;
        queue.add(new int[]{characterX, characterY, 0});
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int count = cur[2];
            if(x==itemX&&y==itemY){
                return count/2;
            }
            for(int i=0;i<4;i++){
                int nx=x+dx[i];
                int ny=y+dy[i];
                if(nx<0||ny<0||nx>=101||ny>=101)continue;
                if(!canGo[nx][ny])continue;
                if(visited[nx][ny])continue;
                visited[nx][ny]=true;
                queue.add(new int[]{nx,ny,count+1});
            }
        }
        int answer = 0;
        return answer;
    }
}
