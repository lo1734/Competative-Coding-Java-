import java.util.*;
public class _19_MinimumToRemoveToMakeValidParentheses {

    public static int fun(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        int max_len = 0;
        st.push(-1);
        int res = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                max_len = Math.max(max_len, i-st.peek());
            }
        }
        return n-max_len;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("Remove "+fun(s)+" chars to make valid string.");
    }
}
