class Solution {
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers,target,0,0);
        return answer;
    }
    public int dfs(int []numbers,int target,int current,int currentN){
        if(current==numbers.length){
            return currentN==target ? 1:0;
        }
        int plus=dfs(numbers,target,current+1,currentN+numbers[current]);
        int minus=dfs(numbers,target,current+1,currentN-numbers[current]);
        return plus+minus;
    }
}
