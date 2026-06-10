import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= count; i++) {
            queue.add(i);
        }
        if(queue.size()==1){
            System.out.print(1);
        }
        while (queue.size()>1) {
            if (queue.size() == 1) {
                System.out.print(queue.pop());
            } else {
                queue.poll();
            }

            if (queue.size() == 1) {
                System.out.print(queue.peek());
                break;
            } else {
                queue.add(queue.poll());
            }
        }
    }
}
