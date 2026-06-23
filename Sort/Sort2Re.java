import java.util.*;
import java.io.*;

public class Main {
    public static int [] A,tmp;
    public static long result;
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        int size=Integer.parseInt(br.readLine());
        A= new int[size+1];
        tmp=new int[size+1];
        for(int i=1;i<=size;i++){
            A[i]=Integer.parseInt(br.readLine());
        }
        merget_sort(1,size);
        for(int i=1;i<=size;i++){
            bw.write(A[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
    private static void merget_sort(int s,int e){
        if(e-s<1){
            return;

        }
        int m= s+(e-s)/2;
        merget_sort(s,m);
        merget_sort(m+1,e);
        for(int i=s;i<=e;i++){
            tmp[i]=A[i];

        }
        int k=s;
        int index1=s;
        int index2=m+1;

        while(index1<=m&&index2<=e){
            if(tmp[index1]>tmp[index2]){
                A[k]=tmp[index2];
                k++;
                index2++;
            }else{
                A[k]=tmp[index1];
                k++;
                index1++;
            }
        }
        while(index1<=m){
            A[k]=tmp[index1];
            k++;
            index1++;
        }
        while(index2<=e){
            A[k]=tmp[index2];
            k++;
            index2++;
        }

    }

}
