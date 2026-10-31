class Solution {
    static final String VOWELS="AEIOU";
    int count=0;
    int answer=0;
    public int solution(String word) {
        dfs("",word);
        return answer;
    }
    public boolean dfs(String cur, String target){
        if(cur.length()==5){
            return false;
        }
        for(int i=0;i<5;i++){
            String next=cur+VOWELS.charAt(i);
            count++;
            if(next.equals(target)){
                answer=count;
                return true;
            }
            if(dfs(next,target))return true;
        }
        return false;
    }
}
