import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] A, tmp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        A = new int[n];
        tmp = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(0, n - 1);

        for (int i = 0; i < n; i++) {
            bw.write(A[i] + " ");
        }
        bw.flush();
        bw.close();
    }

    private static void merge_sort(int s, int e) {
        if (e - s < 1) return;

        int m = s + (e - s) / 2;
        merge_sort(s, m);
        merge_sort(m + 1, e);

        for (int i = s; i <= e; i++) {
            tmp[i] = A[i];
        }

        int k = s;
        int index = s;
        int index2 = m + 1;
        while (index <= m && index2 <= e) {
            if (tmp[index] <= tmp[index2]) {
                A[k++] = tmp[index++];
            } else {
                A[k++] = tmp[index2++];
            }
        }
        while (index <= m) {
            A[k++] = tmp[index++];
        }
        while (index2 <= e) {
            A[k++] = tmp[index2++];
        }
    }
}
