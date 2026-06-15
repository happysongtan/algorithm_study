import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input_string = br.readLine();

        char[] arr = new char[input_string.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input_string.charAt(i);
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }

            char temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        System.out.print(sb); 
    }
}
