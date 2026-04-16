import java.io.*;
import java.util.*;

public class Stack_Beak {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        Stack <Integer> st=new Stack<>();
        int i=0;
        while (n-->0) {
            String input=br.readLine();
            if(input.startsWith("push")){
                String[]arr=input.split(" ");
                int num=Integer.parseInt(arr[1]);
                st.push(num);
            } else if (input.equals("pop")) {
                if(st.isEmpty()){
                    sb.append(-1).append('\n');
                }else {
                    sb.append(st.pop()).append('\n');
                }
            }else if (input.equals("size")) {
                {
                    sb.append(st.size()).append('\n');
                }
            }else if (input.equals("empty")) {
                if(st.isEmpty()){
                    sb.append(1).append('\n');
                }else {
                    sb.append(0).append('\n');
                }
            }else if (input.equals("top")) {
                if(st.isEmpty()){
                    sb.append(-1).append('\n');
                }else {
                    sb.append(st.peek()).append('\n');
                }
            }
        }
        System.out.println(sb);

    }
}
