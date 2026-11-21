import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            String r = Long.toString(a + b).replace("0", "");
            if (r.isEmpty()) r = "0";   // 결과가 0인 경우 대비
            System.out.println("#" + tc + " " + r);
        }
        sc.close();
    }
}
