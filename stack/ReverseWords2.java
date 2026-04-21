package beakJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class beakJoon_reverseWords {
    public static void add_sb(StringBuilder sb,Queue<Character> queue){
            while(!queue.isEmpty()) {
                sb.append(queue.poll());
            }
        }
    public static void add_sb(StringBuilder sb,Stack<Character> stack){
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String sentences=br.readLine();
        char []arr= sentences.toCharArray();
        Queue<Character> queue =new LinkedList<>();
        Stack<Character> stack= new Stack<>();
        int in_q=0; for(int i = 0; i<sentences.length(); i++){
            if(arr[i]=='<'){
                add_sb(sb,stack);
                in_q=1;
            }
            if(arr[i]=='>'){
                in_q=0;
                queue.add('>');
                add_sb(sb,queue);
                continue;
            }
            if(in_q==1){
                queue.add(arr[i]);
                continue;
            }
            if(arr[i]==' ') {
                add_sb(sb,stack);
                sb.append(' ');
            }else if(i==arr.length-1){
                stack.add(arr[i]);
                add_sb(sb,stack);
            }else {
                stack.add(arr[i]);
            }
        }
        System.out.println(sb);
    }
}
