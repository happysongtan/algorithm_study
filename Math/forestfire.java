import java.io.FileInputStream;
import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int []qs=new int [T];
        int maxN=1;
        for(int t=0;t<T;t++){
            qs[t]=sc.nextInt();
            maxN=Math.max(maxN,qs[t]);
        }
        
        int []A=new int[maxN+1];
        A[0]=1;
        A[1]=1;
        int [] mark= new int[maxN/2+3];
        for(int i=2;i<=maxN;i++){
            int limit=i/2+1;
            for(int k=1;2*k<=i;k++){
                int f=2*A[i-k]-A[i-2*k];
                if(f>0&&f<=limit){
                    mark[f]=i;
                }
            }
            int v=1;
            while(mark[v]==i){
                v++;
            }
            A[i]=v;
            
		}
        StringBuilder sb=new StringBuilder();
        for(int t=0;t<T;t++){
            sb.append(A[qs[t]]).append('\n');
        }
        System.out.print(sb);
    }
}
