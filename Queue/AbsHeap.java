import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int count=Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            int absA=Math.abs(a);
            int absB=Math.abs(b);
            if(absA==absB){
                return a-b;
            }
            return absA-absB;

        });
        for(int i=0;i<count;i++){
            int input=Integer.parseInt(br.readLine());
            if(input==0){
                if(pq.isEmpty()){
                    sb.append(0).append("\n");
                }else{
                    sb.append(pq.poll()).append("\n");
                }
            }else{
                pq.add(input);
            }
            
        }
        System.out.print(sb);

    }
}
