class Solution {
    int solution(int[][] land) {
        for(int i=1;i<land.length;i++){
            for(int j=0;j<4;j++){
                int prevMax=0;
                for(int k=0;k<4;k++){
                    if(k!=j){
                        prevMax=Math.max(prevMax,land[i-1][k]);
                        
                    }
                    
                }
                land[i][j]+=prevMax;
            }
        }
        int answer=0;
        for(int v:land[land.length-1]){
            answer=Math.max(answer,v);
        }

        return answer;
    }
}
