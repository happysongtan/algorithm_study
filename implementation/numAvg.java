import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class avgNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String input=br.readLine();
        String [] arrString=input.split(" ");
        double[] arr=new double[arrString.length];
        double max=0;
        for(int i =0;i<arr.length;i++){
            arr[i]=Integer.parseInt(arrString[i]);
            if(arr[i]>max){
                max=arr[i];
            }
        }
        double sum=0;
        for(int i =0;i<arr.length;i++){
//            arr[i]=arr[i]/max*100;
//            sum+=arr[i];
            sum+=arr[i]/max*100;

        }
        System.out.println(sum/ arr.length);

    }
}
