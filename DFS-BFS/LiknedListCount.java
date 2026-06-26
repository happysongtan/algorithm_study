import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] arr;
    static boolean[] visited;
    static int size,link;
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        size=Integer.parseInt(st.nextToken());
        link=Integer.parseInt(st.nextToken());
        arr=new boolean[size+1][size+1];
        visited=new boolean[size+1];
        for(int i=0;i<link;i++){
            st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());

            arr[n][m]=true;
            arr[m][n]=true;
        }
        int count =0;
        for(int i=1;i<=size;i++){
            if(visited[i]==false){
                count++;
                dfs(i);
            }
        }
        System.out.print(count);
    }
    public static void dfs(int node){
        visited[node]=true;
        for(int next=1;next<=size;next++){
            if(arr[node][next]&&visited[next]==false){
                dfs(next);

            }
        }

    }
}
