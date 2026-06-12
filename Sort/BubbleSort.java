import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        mData[] arr=new mData[count];
        for(int i=0;i<count;i++){
            arr[i]=new mData(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<count;i++){
            if(max<arr[i].index-i){
                max=arr[i].index-i;
            }
        }
        System.out.print(max+1);

    }
    static class mData implements Comparable<mData>{
        int value;
        int index;

        public mData(int value,int index){
            this.value=value;
            this.index=index;
        }
        @Override
        public int compareTo(mData o){
            return this.value-o.value;
        }

    }

}
