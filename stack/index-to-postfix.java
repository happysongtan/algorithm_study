package beakJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class beakJoon_notation {
    public static boolean isAlphabet(char sentence){
        if(sentence=='+'||sentence=='-'||sentence=='*'||sentence=='/'||sentence=='('||sentence==')'){
            return false;
        }
        return true;
    }
    public static boolean isOperater(char sentence){
        if(sentence=='/'||sentence=='*'||sentence=='+'||sentence=='-'){
            return true;
        }
        return false;
    }//A+B= AB+
    public static int priroity(char sentence){
        if(sentence=='/'||sentence=='*'){
            return 2;
        } else if (sentence=='-'||sentence=='+') {
            return 1;
        }
        return 0;
    }
    // A+B*C=ABC+*
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        Stack<Character> st_char= new Stack<>();
        String input=br.readLine();
        char [] sentence=input.toCharArray();
        for(int i = 0; i<sentence.length;i++) {
            if(isAlphabet(sentence[i])){
                sb.append(sentence[i]);
                continue;
            }
            if(sentence[i]=='('){
                st_char.add(sentence[i]);
            } else if (sentence[i]==')') {
                while (st_char.peek()!='('){
                    sb.append(st_char.pop());
                }
                st_char.pop();
            } else if (isOperater(sentence[i])) {
                while (!st_char.isEmpty()
                        &&sentence[i]!='('
                        &&priroity(sentence[i])<=priroity(st_char.peek())){
                        sb.append(st_char.pop());
                }
                st_char.add(sentence[i]);
            }
        }
        while (!st_char.isEmpty()){
            sb.append(st_char.pop());
        }
        System.out.println(sb);
    }
}
