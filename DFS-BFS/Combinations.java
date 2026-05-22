class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>answer=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        dfs(1,n,k,answer,temp);
        return answer;
    }
    public void dfs(int start,int n,int k,List<List<Integer>>answer,List<Integer>temp){

        if(temp.size()==k){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for(int i=start;i<=n;i++){
            temp.add(i);
            dfs(i+1,n,k,answer,temp);
            temp.remove(temp.size()-1);
        }
    }
}
