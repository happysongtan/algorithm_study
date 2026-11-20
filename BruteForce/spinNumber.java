import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            sb.append('#').append(test_case).append('\n');
			int size=sc.nextInt();
            int [][]a=new int[size][size];
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    sb.append(a[size-1-j][i]);
                }
                sb.append(" ");
                for(int j=0;j<size;j++){
                    sb.append(a[size-1-i][size-1-j]);
                }
                sb.append(" ");
                for(int j=0;j<size;j++){
                    sb.append(a[j][size-1-i]);
                }
                sb.append("\n");
                
            }
            
			
		}
        System.out.print(sb);
	}
}
