import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int size=Integer.parseInt(br.readLine());
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0;i<size;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
        
    }
}
