package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        String list=br.readLine();
        String []char_arr=list.split(" ");
        int []int_arr=new int[size];
        int [] answer= new int[size];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<size;i++){
            int_arr[i]=Integer.parseInt(char_arr[i]);
            answer[i]=-1;

        }

        //3 5 2 7
        stack.add(0);
        //5 2 7
        for(int i=1;i<size;i++){
            if(!stack.isEmpty()&&int_arr[i]>int_arr[stack.peek()]){
                while (!stack.isEmpty()&&int_arr[i]>int_arr[stack.peek()]){
                    answer[stack.pop()]=int_arr[i];
                }
                stack.add(i);

            }else {
                stack.add(i);
            }
        }
        for(int i=0;i<size;i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}
