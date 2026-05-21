class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited=new boolean[nums.length];
        List<List<Integer>> list=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        dfs(temp,list,nums,visited);  
        return list;     
    }
    public void dfs(List<Integer>temp,List<List<Integer>> list,int[]nums,boolean[]visited){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                temp.add(nums[i]);
                dfs(temp,list,nums,visited);
                temp.remove(temp.size()-1);
                visited[i]=false;
            }
        }

        
    }
}
