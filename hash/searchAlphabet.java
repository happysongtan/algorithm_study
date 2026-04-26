package beakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class beakJoon_searchAlphabet {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        int[] arr=new int[26];
        for (int i =0;i<arr.length;i++){
            arr[i]=-1;
        }
        String input=br.readLine();
        char [] input_arr=new char[input.length()];
        input_arr=input.toCharArray();
        for(int i=0;i<input_arr.length;i++){
            int num=input_arr[i]-'a'; //b위치 찾고 i넣기  0
            if(arr[num]==-1){
                arr[num]=i;
            }

        }
        for (int i =0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);

    }
}
