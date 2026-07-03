import java.util.*;
import java.io.*;

public class Main {
    static int N;
    static int[] arr;
    static int count;
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int input=Integer.parseInt(br.readLine());
        N=input;
        arr=new int[input];
        backT(0);
        System.out.print(count);
    }
    static void backT(int row){
        if(row==N){
            count++;
            return;
        }
        for(int i=0;i<N;i++){
            arr[row]=i;
            if(checkQ(row)){
                backT(row+1);
            }
        }
    }
    static boolean checkQ(int row){
        for(int i=0; i<row;i++){
            if(arr[i]==arr[row]){
                return false;
            }
            if(Math.abs(i-row)==Math.abs(arr[row]-arr[i])){
                return false;

            }
        }
        return true;
    }
}
