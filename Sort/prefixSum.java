import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prefixSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String input=br.readLine();
        String arr=br.readLine();
        String[]input_count=input.split(" ");
        String String_arr[]=arr.split(" ");
        int[] int_arr=new int [String_arr.length];
        int[] sum_arr=new int [String_arr.length];
        for(int i =0;i<String_arr.length;i++){
            int_arr[i]=Integer.parseInt(String_arr[i]);
            if(i==0){
                sum_arr[i]=int_arr[i];
            }else {
                sum_arr[i]=int_arr[i]+sum_arr[i-1];
            }
        }

        int count=Integer.parseInt(input_count[1]);
        while (count>0){
            input=br.readLine();
            input_count=input.split(" ");
            int start=Integer.parseInt(input_count[0]);
            int end=Integer.parseInt(input_count[1]);
            if(start==1){
                sb.append(sum_arr[end-1]).append('\n');
            }else {
                sb.append(sum_arr[end-1]-sum_arr[start-2]).append('\n');
            }
            count--;
        }
        System.out.println(sb);
    }
}
