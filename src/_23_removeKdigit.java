import java.util.*;

public class _23_removeKdigit {

    public static String remKdigit(String num, int k){
        int n = num.length();
        if(k>=n) return "0";

        Stack<Character> st = new Stack<>();
        for(char c : num.toCharArray()){

            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        res.reverse();
        while(res.length()>0 && res.charAt(0)=='0') res.deleteCharAt(0);
        return res.length()==0 ? "0" : res.toString();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        String res = remKdigit(s,k);
        System.out.println("Minivalue after removing "+k+" digits is: "+res);
    }
}