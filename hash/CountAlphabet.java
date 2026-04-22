import java.util.*;
import java.io.*;

class BeakJoon {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String sentences = br.readLine();
        int[] numArr = new int[26];
        char[] arr = sentences.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i] - 'a';
            numArr[num] += 1;
        }

        for (int i = 0; i < numArr.length; i++) {
            sb.append(numArr[i]).append(" ");
        }

        System.out.print(sb);
    }
}
