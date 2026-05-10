import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DnaRe {
    public static void DnaCount(String sentence,int[] Count){
            if(sentence.equals("A")){
                Count[0]++;
            }else if(sentence.equals("C")){
                Count[1]++;
            }else if(sentence.equals("G")){
                Count[2]++;
            }else if(sentence.equals("T")){
                Count[3]++;
            }
    }
    public static void DnadisCount(String sentence,int[] Count){
        if(sentence.equals("A")){
            Count[0]--;
        }else if(sentence.equals("C")){
            Count[1]--;
        }else if(sentence.equals("G")){
            Count[2]--;
        }else if(sentence.equals("T")){
            Count[3]--;
        }
    }
    public static int isSame(int[] Count,int[] ArrCount,int count){
        if(Count[0]>=ArrCount[0]&&Count[1]>=ArrCount[1]&&Count[2]>=ArrCount[2]&&Count[3]>=ArrCount[3]){
            return count+1;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String string_length=br.readLine();
        String length_arr[]=string_length.split(" ");// 9 8
        String string_sentence=br.readLine();//ABCED
        String[] arr_string_sentcence=string_sentence.split("");// CCTGGATTG
        String string_count=br.readLine();
        String[] stringArrCount=string_count.split(" ");//2 0 1 1
        int []ArrCount=new int[stringArrCount.length];
        for(int i=0;i<ArrCount.length;i++){
            ArrCount[i]=Integer.parseInt(stringArrCount[i]);
        }
        int start=0;
        int end=Integer.parseInt(length_arr[1]);
        int count =0;
        int [] Count=new int[ArrCount.length];
        for(int i=0;i<end;i++){
            DnaCount(arr_string_sentcence[i],Count);
        }
        while(end<arr_string_sentcence.length){
            count=isSame(Count,ArrCount,count);

            DnaCount(arr_string_sentcence[end],Count);
            DnadisCount(arr_string_sentcence[start],Count);
            end++;
            start++;
        }
        count=isSame(Count,ArrCount,count);
        System.out.println(count);

    }
}
