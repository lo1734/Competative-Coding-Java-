import java.util.*;
public class _19_MinimumToRemoveToMakeValidParentheses {


    public static String minToRem(String s){
        int n = s.length();
        Stack<Integer> st = new Stack<>();
        char[] c = s.toCharArray();
        for(int i=0;i<n;i++){
            if(c[i]=='(') st.push(i);
            else if(c[i]==')'){
                if(!st.isEmpty()) st.pop();
                else c[i] = '*';
            }
//            for(int k=0;k<n;k++){
//                System.out.print(c[k]+" ");
//            }
//            System.out.println(" ");
        }
        while(!st.isEmpty()){
            c[st.pop()] ='*';
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:c){
            if(ch != '*') sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String res = minToRem(s);
        System.out.println("Valid string is "+res);
    }
}
