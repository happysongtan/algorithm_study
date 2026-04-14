import java.util.*;
class Solution {
    public boolean isPrime(String str){
        int num=Integer.parseInt(str);
        if(num<2){
            return false;
            }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
            }
         return true;
        }
    public void check_Prime(String target,char arr[],boolean[]visited,HashSet<Integer>set)  {
        if(!target.equals("")&&isPrime(target)){
        set.add(Integer.parseInt(target));
        }
        for(int i=0;i<visited.length;i++){
            if(visited[i]==false){
                visited[i]=true;

                check_Prime(target+arr[i],arr,visited,set);
                visited[i]=false;
                }                    
            }         
        }
    public int solution(String numbers){
        boolean []visited= new boolean[numbers.length()];
        char[]arr=numbers.toCharArray(); 
        HashSet <Integer> set=new HashSet<>();
        check_Prime("",arr,visited,set);
        return set.size();
    }
}
