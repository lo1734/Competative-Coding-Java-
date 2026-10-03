import java.util.*;

public class addTwoNumbers {
    public static Node rev(Node head){
        if(head==null) return head;
        Node prev = null;
        Node ptr = head;
        while(ptr!=null){
            Node nxt = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = nxt;
        }
        return prev;
    }
    public static Node addFun(Node h1,Node h2){

        Node res = new Node(Integer.MIN_VALUE);
        Node ans = res;
        int carry = 0;
        while(h1!=null || h2!=null || carry!=0){
            int sum =  carry;
            if(h1!=null) {
                sum+=h1.val;
                h1 = h1.next;
            }
            if(h2!=null) {
                sum+=h2.val;
                h2 = h2.next;
            }

            carry = sum/10;
            res.next = new Node(sum%10);
            res = res.next;
        }
        return ans.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head1 = new Node(Integer.MIN_VALUE);
        Node head2 = new Node(Integer.MIN_VALUE);
        Node h1 = head1;
        Node h2 = head2;
        while(sc.hasNextInt()){
            int k = sc.nextInt();
            if(k==-1){
                head1.next = null;
                break;
            }
            head1.next = new Node(k); head1 = head1.next;
        }
        System.out.println("");
        while(sc.hasNextInt()){
            int k = sc.nextInt();
            if(k==-1){
                head2.next = null;
                break;
            }
            head2.next = new Node(k); head2 = head2.next;
        }
        h1 = rev(h1.next);
        h2 = rev(h2.next);
        Node res = addFun(h1,h2);
        res = rev(res);
        System.out.println("Result of addition is: ");
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
        sc.close();
    }
}
