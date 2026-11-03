class Solution {
    Integer[][] memo;
    public int solution(int[][] triangle) {
        memo=new Integer[triangle.length][triangle.length];
        return dfs(triangle,0,0);
    }
    public int dfs(int [][] triangle,int num,int dept){
        if(dept==triangle.length-1) return triangle[dept][num];
        if(memo[dept][num]!=null) return memo[dept][num];
        int best=triangle[dept][num]+Math.max(dfs(triangle,num,dept+1),dfs(triangle,num+1,dept+1));
        return memo[dept][num]=best;
        
    }
}
