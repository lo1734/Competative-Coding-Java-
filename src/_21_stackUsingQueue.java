import java.util.*;

class myStack{
    Queue<Integer> q = new ArrayDeque<>();

    public void push(int x){
        int n = q.size();
        q.add(x);
        for(int i=0;i<n;i++){
            q.add(q.remove());
        }
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public int pop(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return q.remove();
    }
    public int top(){
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        return q.peek();
    }
}
public class _21_stackUsingQueue {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myStack st = new myStack();
        int n = sc.nextInt();
        for(int i=0;i<n;i++) st.push(sc.nextInt());
//        st.push(23);
//        st.push(324);
//        st.pop();
//        st.top();
        while(!st.isEmpty()){
            System.out.print(st.top()+" ");
            st.pop();
        }

    }
}
