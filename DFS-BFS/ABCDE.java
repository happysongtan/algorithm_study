import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] arr;
    static boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        visited = new boolean[node];
        arr = new ArrayList[node];

        for (int i = 0; i < node; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            arr[S].add(E);
            arr[E].add(S);
        }

        for (int i = 0; i < node; i++) {
            dfs(i, 1);
            if (arrive) break;
        }

        System.out.print(arrive ? 1 : 0);
    }

    static void dfs(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;

        for (int next : arr[now]) {
            if (!visited[next]) {
                dfs(next, depth + 1);
            }
        }

        visited[now] = false;
    }
}
