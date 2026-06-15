import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input_string = br.readLine();

        Character[] arr = new Character[input_string.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input_string.charAt(i);
        }

        Arrays.sort(arr,Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.print(sb); 
    }
}
