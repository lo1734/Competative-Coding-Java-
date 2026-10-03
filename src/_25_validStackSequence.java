import java.util.*;

public class _25_validStackSequence {
    public static boolean isValid(int[] pushed, int[] popped){
//        int n = pushed.length;
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        for(int val:pushed){
            st.push(val);
            while(!st.isEmpty() && st.peek()==popped[idx]){
                st.pop();
                idx++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();

        int n = sc.nextInt();
        int[] pushed = new int[n];
        int[] popped = new int[n];
        System.out.println("Enter the stack input sequence: ");
        for(int i=0;i<n;i++) pushed[i] = sc.nextInt();
        System.out.println("Enter the element for popped sequence: ");
        for(int i=0;i<n;i++) popped[i] = sc.nextInt();
        boolean res = isValid(pushed, popped);
        System.out.println(res?"This is valid popped sequence.":"This is invalid popped sequence.");
    }
}
