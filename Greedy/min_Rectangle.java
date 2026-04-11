class Solution {
    public int solution(int[][] sizes) {
        for(int i= 0;i<sizes.length;i++){
            int change=0;
            if(sizes[i][1]>sizes[i][0]){
                change=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=change;
            }
        }
        int row=0;
        int col=0;
        for(int i= 0;i<sizes.length;i++){
            if(sizes[i][0]>row){
                row=sizes[i][0];
            }
            if(sizes[i][1]>col){
                col=sizes[i][1];
            }
        }
        
        
        int answer = row*col;
        return answer;
    }
}
