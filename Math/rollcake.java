class Solution {
    public int solution(int[] topping) {
        int [] right=new int[10001];
        boolean []left=new boolean[10001];
        int rightkinds=0;
        int leftkinds=0;
        for(int t:topping){
            if(right[t]++==0){
                rightkinds++;
            }
        }
        int answer=0;
        for(int t: topping){
            if(--right[t]==0){
                rightkinds--;
            }
            if(!left[t]){
                left[t]=true;
                leftkinds++;
            }
            if(leftkinds==rightkinds){
                answer++;
            }
        }
        return answer;
    }
}
