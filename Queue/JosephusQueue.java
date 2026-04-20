package java_0420.오전;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BeakJoon {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Queue<Integer> queue=new LinkedList<>();
        String String_input=br.readLine();
        String[] arr=String_input.split(" ");
        int input=Integer.parseInt(arr[0]);
        int count=Integer.parseInt(arr[1]);

        int i_count=1;
        for(int i=1;i<=input;i++){
            queue.add(i);
        }
        sb.append("<");
        while (!queue.isEmpty()){// count 3
            if(i_count==count){
                sb.append(queue.poll());
                if(!queue.isEmpty()){
                    sb.append(", ");
                }
                i_count=1;

            }else {
                queue.add(queue.poll());
                i_count++;
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
