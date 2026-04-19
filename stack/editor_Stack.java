package BeakJoon;
import java.util.*;
import java.io.*;
public class editorStack {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        Stack<Character> front_st= new Stack<>();
        Stack<Character> back_st= new Stack<>();
        Stack<Character> blank=new Stack<>();
        String str=br.readLine();
        int n=Integer.parseInt(br.readLine());
        for(char c : str.toCharArray()){
            front_st.add(c);
        }
        String[]arr;
        while (n-->0){
            String input=br.readLine();
            if(front_st.size()==0&&input.equals("L")){
                continue;
            }
            if(front_st.size()==0&&input.equals("B")){
                continue;
            }
            if(back_st.size()==0&&input.equals("D")){
                continue;
            }
            if(front_st.size()!=0&&input.equals("L")){
                back_st.add(front_st.pop());
            } else if (input.equals("D")) {
                front_st.add(back_st.pop());
            }else if(input.equals("B")){
                front_st.pop();
            }else {
                arr=input.split(" ");
                front_st.add(arr[1].charAt(0));
            }
        }
        int index=front_st.size();
        for(int i=0;i<index;i++){
            blank.add(front_st.pop());
        }
        index=blank.size();
        for(int i=0;i<index;i++){
            sb.append(blank.pop());
        }
        index=back_st.size();
        for(int i=0;i<index;i++){
            sb.append(back_st.pop());
        }
        System.out.println(sb);
    }
}
