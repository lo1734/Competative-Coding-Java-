import java.util.*;

class myQueue{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public  void enQueue(int x){
        st1.push(x);
    }
    public boolean isEmpty(){
        return st1.isEmpty() && st2.isEmpty();
    }
    public void shiftStacks(){
        if(st2.isEmpty()){
            while(!st1.isEmpty()){
                st2.push(st1.pop());
            }
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Underflow.");
            return Integer.MIN_VALUE;
        }
        shiftStacks();
        return st2.pop();
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow.");
            return Integer.MIN_VALUE;
        }
        shiftStacks();
        return st2.peek();
    }

}
public class _20_queueUsingStack {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        myQueue q = new myQueue();
        int n = sc.nextInt();
        while(n>0){
            q.enQueue(sc.nextInt());
            n--;
        }

        while(!q.isEmpty()){
            System.out.print(q.deQueue()+" ");
        }
        sc.close();
    }
}
