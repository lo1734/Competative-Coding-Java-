import java.util.*;

class minStack{
    Stack<Integer> min_st = new Stack<>();
    Stack<Integer> st = new Stack<>();

    public void push(int x){
       st.push(x);
       if(min_st.isEmpty() || min_st.peek()>=x){
           min_st.push(x);
       }
    }

    public void pop(){
        if(st.isEmpty()){
            return;
        }
        int poppedVal = st.pop();
        if(min_st.peek().equals(poppedVal)){
            min_st.pop();
        }
    }

    public int top(){
        if(st.isEmpty()) return Integer.MIN_VALUE;
        return st.peek();
    }
    public int getMin(){
        if(min_st.isEmpty()) return Integer.MIN_VALUE;
        return min_st.peek();
    }

}
public class _22_minStack {

    public static void main(String[] args) {
        minStack st = new minStack();
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while(n>0){
//            st.push(sc.nextInt());
//            n--;
//        }
//        System.out.println("Minimum element is: "+st.getMin());
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.getMin");
        System.out.println("5.Exit");
        boolean flag = true;
        while(flag){
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the value to push: ");
                    int k = sc.nextInt();
                    st.push(k);
                    break;
                case 2:
                    int val = st.top();
                    st.pop();
                    System.out.println("Popped element is: "+val);
                    break;

                case 3:
                    System.out.println("top of the stack is: "+st.top());
                    break;
                case 4:
                    System.out.println("Minimum element is: "+st.getMin());
                    break;
                case 5:
                    flag = false;
                    System.out.println("Exit.....");
                    break;
            }
        }
//        System.out.println("--- Pushing Elements ---");
//        stack.push(5);
//        System.out.println("Pushed: 5 | Current Min: " + stack.getMin());
//
//        stack.push(2);
//        System.out.println("Pushed: 2 | Current Min: " + stack.getMin());
//
//        stack.push(10);
//        System.out.println("Pushed: 10 | Current Min: " + stack.getMin());

//        stack.push(2);
//        System.out.println("Pushed: 2 (duplicate min) | Current Min: " + stack.getMin());
//
//        System.out.println("\n--- Current Top ---");
//        System.out.println("Top element: " + stack.top());
//
//        System.out.println("\n--- Popping Elements ---");
//        stack.pop();
//        System.out.println("Popped duplicate 2 | Current Min: " + stack.getMin());
//
//        stack.pop();
//        System.out.println("Popped 10 | Current Min: " + stack.getMin());
//
//        stack.pop();
//        System.out.println("Popped original 2 | Current Min: " + stack.getMin());
    }
}