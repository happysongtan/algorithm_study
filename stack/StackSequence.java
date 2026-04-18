import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class BeakStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int index = 0;

        for (int i = 0; i < n; i++) {
            int ip = Integer.parseInt(br.readLine());
            while (true) {
                if (!st.isEmpty()&&st.peek() == ip) {
                    sb.append("-").append("\n");
                    st.pop();
                    break;
                }else if(ip<count){
                    index++;
                    break;
                }
                else {
                    count++;
                    st.push(count);
                    sb.append("+").append("\n");
                }
            }
        }
        if(index>0){
            System.out.println("NO");
        }else {
        System.out.println(sb);
        }

    }
}
