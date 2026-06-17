import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int size=Integer.parseInt(st.nextToken());
        int target_index= Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }   
        Arrays.sort(arr);
        System.out.print(arr[target_index-1]);
    }
    public void quick(int start,int end,int target,int [] arr){
        if(start<end){
            int K=dfs(start,end,arr);
            if(K==target){
                return;

            }else if(K<target){
                quick(start,K-1,target,arr);
            }else{
                quick(K+1,end,target,arr);
            }

        }
    }
    public int dfs(int start,int end,int []arr){
        if(start+1==end){
            if(arr[start]>arr[end]){
                swap(start,end,arr);
                return end;
            };
        }
        int M=(start+end)/2;
        swap(start,M,arr);
        int pivot=arr[start];
        int i=start+1;
        int j=end;
        while(j>=start+1&&pivot<arr[j]){
            j--;

        }
        while(i<=end&&pivot>arr[i]){
            i++;
        }
        if(i>=j){
            swap(i++,j--,arr);
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
   }
    public void swap(int i,int j,int []arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];

    }
}
