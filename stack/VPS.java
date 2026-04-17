import java.io.*;
public class beak_ {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            while (n-- > 0) {
                String brackets = br.readLine();
                char[] arr = brackets.toCharArray();

                for (int i = 0; i < arr.length; i++) {
                    if (count == 0 && arr[i] == (')')) {
                        count--;
                        break;
                    }
                    if (arr[i] == ('(')) {
                        count++;
                    }
                    if (arr[i] == (')')) {
                        count--;
                    }

                }
                if (count == 0) {
                    sb.append("YES").append('\n');
                } else {
                    sb.append("NO").append('\n');
                }
                count = 0;
            }
            System.out.print(sb);
        }
    }
