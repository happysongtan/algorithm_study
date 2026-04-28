class Solution {
    public int solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            int sum=i;
            if(sum==n){
                count++;
                continue;
            }
            for(int j=i+1;j<=n;j++){
                sum+=j;
                if(sum==n){
                    count++;
                    break;
                }
                if(sum>n){
                    break;
                }
            }
        }
        int answer = count;
        return answer;
    }
}
