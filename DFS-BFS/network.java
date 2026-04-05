class Solution {
    public void verification(int index,int[][] computers,boolean []visited){
        visited[index]=true;
        for(int j=0;j<computers.length;j++){
            if(visited[j]==false&&computers[index][j]==1){
                verification(j,computers,visited);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                count++;
                verification(i,computers,visited);
            }
        }     
        return count;

    }
}
