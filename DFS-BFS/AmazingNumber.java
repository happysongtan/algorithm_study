import java.util.*;
import java.io.*;

public class Main {
    static int input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        input = Integer.parseInt(br.readLine());

        dfs(2, 1);
        dfs(3, 1);
        dfs(5, 1);
        dfs(7, 1);
    }

    static void dfs(int num, int pos) {
        if (pos == input) {
            System.out.println(num);
            return;
        }

        for (int i = 1; i <= 9; i += 2) {
            if (isPrime(num * 10 + i)) {
                dfs(num * 10 + i, pos + 1);
            }
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
