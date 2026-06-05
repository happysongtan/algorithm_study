import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int input=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        Deque<Integer>stack=new ArrayDeque<>();
        int[] arr=new int[input];
        int[]answer=new int[input];
        for(int i=0;i<input;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        //
        for(int i=0;i<input;i++){
            int now =arr[i];// now 9 stack 0
                            // now 5 stack 0,1 arr[stack]= 3
                            // now 4 stack 0,1,2 arr[stack]=4 
                            // now 8 stack 0, 1, 2,arr[stack]4
            if(stack.isEmpty()||arr[stack.peek()]>now){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&arr[stack.peek()]<now){
                    int index=stack.pop();
                    answer[index]=arr[i];
                }
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            int index=stack.pop();
            answer[index]=-1;
        }
        for(int i=0;i<answer.length;i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.print(sb);
    }
}
