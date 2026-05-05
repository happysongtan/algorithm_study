import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsecutiveSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        int start=1;
        int end=1;
        int count=1;
        int sum=1;
        while (end<input){
            if(sum==input){
                count++;
                end++;
                sum=sum+end;
            }else if(sum>input){
                sum-=start;
                start++;
            }else if(sum<input){
                end++;
                sum+=end;
            }
        }
        System.out.println(count);
    }
}
