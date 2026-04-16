import java.util.*;
import java.io.*;
public class BaekJoon {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int n=Integer.parseInt(br.readLine());
        while(n-->0){
            String str= br.readLine();
            String arr[]=str.split(" ");
            for(int i=0;i<arr.length;i++){
                char[] ch=arr[i].toCharArray();
                for(int j=ch.length-1;j>=0;j--){
                    sb.append(ch[j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
