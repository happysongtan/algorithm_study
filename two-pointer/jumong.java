import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class jumong {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input_count=Integer.parseInt(br.readLine());
        int target=Integer.parseInt(br.readLine());
        String  input_arr=br.readLine();
        String arr_string[]=input_arr.split(" ");
        int [] arr=new int [arr_string.length];

        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(arr_string[i]);
        }
        Arrays.sort(arr);
        int count=0;
        int start=0;
        int end= arr.length-1;
        while (end>start){
            if(arr[start]+arr[end]<target){
                start++;
            }else if(arr[start]+arr[end]>target){
                end--;
            }else {
                count++;
                start++;
                end--;
            }
        }
        System.out.println(count);

    }
}
