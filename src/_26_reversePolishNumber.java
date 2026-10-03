import java.util.*;

public class _26_reversePolishNumber {
    public static int evalRPN(String[] s){
        Stack<Integer> st = new Stack<>();

        for(String t: s){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b = st.pop();
                int a = st.pop();

                switch(t){
                    case "+": st.push(a+b); break;
                    case "-": st.push(a-b); break;
                    case "*": st.push(a*b); break;
                    case "/": st.push(a/b); break;
                }
            }else st.push(Integer.parseInt(t));
        }
        return st.pop();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] tokens = input.trim().split("\\s+");

        try{
            int res = evalRPN(tokens);
            System.out.println("Result of the expression is: "+res);
        }catch (Exception e){
            System.out.println("Expression is invalid.");
        }
        sc.close();
    }
}
