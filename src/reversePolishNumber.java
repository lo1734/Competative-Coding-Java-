import java.util.*;
public class reversePolishNumber {

    public static int solve(String[] s){
        Stack<Integer> st = new Stack<>();

        for(String t : s){
            if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")){
                int b = st.pop();
                int a = st.pop();

                switch(t){
                    case "+":
                        st.push(a+b);
                        break;

                    case "-":
                        st.push(a-b);
                        break;
                    case "*":
                        st.push(a*b);
                        break;

                    case "/":
                        st.push(a/b);
                        break;
                }
            }else st.push(Integer.parseInt(t));
        }
        return st.pop();
    }
    public static void main(String[] args){
        String[] s = {"2", "1", "+", "3", "*"};
        int val = solve(s);
        System.out.println("Result of this expression is: "+val);
    }
}
