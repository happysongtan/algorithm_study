package beakJoon;
import java.util.*;
import java.io.*;

public class beakJoon_queue {
    public static void main(String []args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        Queue<Integer> queue= new LinkedList<>();
        int n= Integer.parseInt(br.readLine());
        int back=0;
        while(n-->0){
            String str= br.readLine();
            if(queue.isEmpty()&&str.equals("pop")){
                sb.append("-1").append("\n"); continue;
            }
            if(queue.isEmpty()&&str.equals("front")){
                sb.append("-1").append("\n"); continue;
            }
            if(queue.isEmpty()&&str.equals("back")){
                sb.append("-1").append("\n");
                continue;
            }else if(queue.isEmpty()&&str.equals("empty")){
                sb.append("1").append("\n"); continue;
            } if(!queue.isEmpty()&&str.equals("empty")){
                sb.append("0").append("\n"); continue;
            }
            if(!queue.isEmpty()&&str.equals("pop")){
                sb.append(queue.poll()).append("\n");
            }else if(str.equals("size")){
                sb.append(queue.size()).append("\n");
            }else if(!queue.isEmpty()&&str.equals("front")){
                sb.append(queue.peek()).append("\n");
            }else if(!queue.isEmpty()&&str.equals("back")){
                sb.append(back).append("\n");
            }else {
                String [] arr= str.split(" ");
                queue.add(Integer.parseInt(arr[1]));
                back=Integer.parseInt(arr[1]);
            }
        }
        System.out.println(sb);
    }
}


