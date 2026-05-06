package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class remainderSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int C=Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        long count=0;
        long[]arr=new long[N];
        long[]c_arr=new long[C];
        long sum=0;
        long remainder=0;
        for(int i=0;i<N;i++){
            sum=sum+Integer.parseInt(st.nextToken());
            arr[i]=sum;
        }
        for(int i=0;i<N;i++){
            remainder=arr[i]%C;
            if(remainder==0)count++;
            c_arr[(int)remainder]++;
        }
        for(int i=0;i<C;i++){
            if(c_arr[i]>1){
                count=count+(c_arr[i]*(c_arr[i]-1)/2);
            }
        }
        System.out.println(count);
    }
}
