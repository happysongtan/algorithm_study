class Solution {
    int zero=0;
    int zeroCount=0;
    int count=0;
    public int[] solution(String s) {
        char[]arr=s.toCharArray();
        while(!s.equals("1")){
            zero=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='0'){
                    zero++;
                }
            }
            s=Integer.toBinaryString(s.length()-zero);
            arr=s.toCharArray();
            zeroCount+=zero;
            count++;
        }
        int[] answer = {count,zeroCount};
        return answer;
    }
    
}
