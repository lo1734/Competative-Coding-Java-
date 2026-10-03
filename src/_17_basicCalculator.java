import java.util.*;

public class _17_basicCalculator {

    public static int calc1(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int res = 0, sign = 1,num = 0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }else if(c=='+'){
                res = res+ sign*num;
                sign = 1;
                num = 0;
                System.out.println("res: "+res);

            }else if(c=='-'){
                res = res + sign*num;
                sign = -1;
                num = 0;
                System.out.println("res: "+res);
            }else if(c=='*'){
                if(res==0) res=1;
                res = res * (sign*num);
                sign = 1;
                num = 0;
                System.out.println("res: "+res);
            }else if(c=='/'){
                if(res==0) res=1;
                res = res/(sign*num);
                sign = 1;
                num = 0;
                System.out.println("res: "+res);
            }else if(c=='('){
                st.push(res);
                st.push(sign);
                res = 0;
                sign = 1;
                System.out.println("res: "+res);
            }else if(c==')'){
                res = res+ sign*num;
                num = 0;
                int prev_sign = st.pop();
                int prev_val = st.pop();
                res = prev_val + sign*res;
                System.out.println("res: "+res);
            }
        }
        return res+ sign*num;
    }

    public static int calc(String s){
        int n = s.length();
        if(n==0) return 0;
        Stack<Integer> st = new Stack<>();
        int num = 0,idx = 0;
        char sign = '+';

        while(idx<n){
            char c = s.charAt(idx++);
            if(Character.isDigit(c)){
                num = num*10 + (c-'0');
            }
//            else if()
        }
        return 0;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String s = sc.nextLine();
       System.out.println("result of expression: "+calc(s));
    }
}