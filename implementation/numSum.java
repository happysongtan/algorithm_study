import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=Integer.parseInt(br.readLine());
        String num=br.readLine();
        char [] arr=num.toCharArray();
        int answer=0;
        for(int i=0;i<arr.length;i++){
            answer=answer+(arr[i]-'0');
        }
        System.out.println(answer);
    }
}
