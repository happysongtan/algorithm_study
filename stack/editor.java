package BeakJoon;
import java.util.*;
import java.io.*;
public class editor {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        LinkedList<Character> list=new LinkedList<>();
        int cursor=0;
        String str=br.readLine();
        int n=Integer.parseInt(br.readLine());
        for(char c : str.toCharArray()){
            list.add(c);
        }//abcd
        String[]arr;
        cursor=list.size();
        while (n-->0){
            String input=br.readLine();
            if(cursor==0&&input.equals("L")){
                continue;
            }
            if(cursor==0&&input.equals("B")){
                continue;
            }
            if(cursor==list.size()&&input.equals("D")){
                continue;
            }
            if(cursor!=0&&input.equals("L")){
                cursor--;
            } else if (cursor!=list.size()&&input.equals("D")) {
                cursor++;
            }else if(cursor!=0&&input.equals("B")){
                list.remove(cursor-1);
                cursor--;
            }else {
                arr=input.split(" ");
                list.add(cursor,arr[1].charAt(0));
                cursor++;
            }
        }
        for(char c:list){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
