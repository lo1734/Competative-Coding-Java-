import java.util.*;

public class _15_validParentheses {

    public static boolean isValid(String s){

        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(char c: s.toCharArray()){

            if(c=='(' || c=='{' || c=='[') st.push(c);
            else{

                if(st.isEmpty()) return false;
                else if((c==')' && st.peek() == '(') || (c=='}' && st.peek() == '{') || (c==']' && st.peek() == '[')){
                    st.pop();
                }else return false;
            }

//            else st.push(c);
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        boolean res = isValid(s);
        System.out.println((res==true)?"This is valid string":"This is not valid string.");
    }
}