import java.util.*;
class Solution {
    public int[] solution(String s) {
        char[] sArr=s.toCharArray();
        String[] arr=new String[501];
        boolean [] visited=new boolean[1000001];
        String stack="";
        for(int i=0;i<sArr.length;i++){
            if(sArr[i]=='}'){
                if(StrCheck(stack)==0){
                    break;
                }
                int size=StrCheck(stack);
                arr[size]=stack;
                stack="";
            }else if(stack.length()!=0&&sArr[i]==','){
                stack=stack+sArr[i];
            }else if(Character.isDigit(sArr[i])){
                stack=stack+sArr[i];
            }
        }
        int j=1;
        ArrayList<Integer>list=new ArrayList<>();
        while(j<=500&&arr[j]!=null){
            String[] NumArr=arr[j].split(",");
            for(int i=0;i<NumArr.length;i++){
                if(!visited[Integer.parseInt(NumArr[i])]){
                    visited[Integer.parseInt(NumArr[i])]=true;
                    list.add(Integer.parseInt(NumArr[i]));
                }
            }
            j++;
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
    public int StrCheck(String s){
        int stack=0;
        char[] arr=s.toCharArray();
        if(arr.length==0){
            return 0;
        }
        for(int i=0;i<s.length();i++){
            if(arr[i]==','){
                stack++;
            }
        }
        return stack+1;
        
    }
}
