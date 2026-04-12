import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int [] fir={1,2,3,4,5};
        int [] sec={2,1,2,3,2,4,2,5};
        int [] thi={3,3,1,1,2,2,4,4,5,5};
        ArrayList<Integer> list=new ArrayList<>();
        int f=0;
        int fcount=0;
        int s=0;
        int scount=0;
        int t=0;
        int tcount=0;
        for(int i=0;i<answers.length;i++){
            if(f==5){
                f=0;
            }
            if(s==8){
                s=0;
            }
            if(t==10){
                t=0;
            }
            if(answers[i]==fir[f]){
                fcount++;
            }
            if(answers[i]==sec[s]){
                scount++;
            }
            if(answers[i]==thi[t]){
                tcount++;
            }
            f++;
            s++;
            t++;
        }
        int max=fcount;
        if(max<scount){
            max=scount;
        }
        if(max<tcount){
            max=tcount;
        }
        if(max==fcount){
            list.add(1);
        }
        if(max==scount){
            list.add(2);
        }
        if(max==tcount){
            list.add(3);
        }
        
        //int[] answer = list.stream().mapToInt(i -> i).toArray();
        int []answer=new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}
