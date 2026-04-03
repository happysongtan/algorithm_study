import java.util.*;
class Solution {
public int[] solution(String[] operations) {
    PriorityQueue <Integer> sortAsc=new PriorityQueue<>();
    PriorityQueue <Integer> sortDesc= new PriorityQueue<>((a,b)->{
        return b-a;
    });
    HashMap <Integer, Integer>hashAsc =new HashMap<>();
    HashMap <Integer, Integer>hashDesc =new HashMap<>();
    int index=0;
    int delete;

    while(index<operations.length){
        String [] arr=operations[index++].split(" ");
        String command=arr[0];
        int target=Integer.parseInt(arr[1]);
    while(!sortAsc.isEmpty() && hashAsc.getOrDefault(sortAsc.peek(), 0) > 0){
        int cur = sortAsc.poll();
        hashAsc.put(cur, hashAsc.get(cur) - 1);
        }

    while(!sortDesc.isEmpty() && hashDesc.getOrDefault(sortDesc.peek(), 0) > 0){
        int cur = sortDesc.poll();
        hashDesc.put(cur, hashDesc.get(cur) - 1);
        }
        if(command.equals("I")){
            sortAsc.offer(target);
            sortDesc.offer(target);          
        }else if(command.equals("D")){
            if(target==1){
                if(!sortDesc.isEmpty()){
                    delete=sortDesc.poll();
                    hashAsc.put(delete,hashAsc.getOrDefault(delete,0)+1);
                }
            }
            if(!sortAsc.isEmpty()){
                if(target==-1){
                    delete=sortAsc.poll();
                    hashDesc.put(delete,hashDesc.getOrDefault(delete,0)+1);
                }
            }
        }
    }
    while(!sortAsc.isEmpty() && hashAsc.getOrDefault(sortAsc.peek(), 0) > 0){
        int cur = sortAsc.poll();
        hashAsc.put(cur, hashAsc.get(cur) - 1);
    }

    while(!sortDesc.isEmpty() && hashDesc.getOrDefault(sortDesc.peek(), 0) > 0){
        int cur = sortDesc.poll();
        hashDesc.put(cur, hashDesc.get(cur) - 1);
    }
    int [] answer=new int [2];
    if(sortAsc.isEmpty()||sortDesc.isEmpty() ){
        answer[0]=0;
        answer[1]=0;
        return answer;
    }else{            
        answer[0]=sortDesc.peek();
        answer[1]=sortAsc.peek();
        return answer;
    }   
}
}
