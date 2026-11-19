import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int [] dx={0,1,0,-1};
        int [] dy={1,0,-1,0};
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n=sc.nextInt();
            int answer[][]=new int [n][n];
            int x=0,y=0,dir=0;
     		for(int num=1;num<=n*n;num++){
                answer[x][y]=num;
                int nx=x+dx[dir];
                int ny=y+dy[dir];
           		if(nx<0||nx>=n||ny<0||ny>=n||answer[nx][ny]!=0){
                	dir=(dir+1)%4;
                	nx=x+dx[dir];
                	ny=y+dy[dir];
            	}
                y=ny;
                x=nx;
            }
           	System.out.println("#"+test_case);
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder();
                for(int j=0;j<n;j++){
                    sb.append(answer[i][j]).append(" ");
                }
                System.out.println(sb.toString().trim());
            }
            
		}
	}
    
    
}
