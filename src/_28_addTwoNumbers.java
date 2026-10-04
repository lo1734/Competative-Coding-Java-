import java.util.*;
public class _28_addTwoNumbers {

    public static Node rev(Node head){
        if(head == null) return null;
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
    public static Node add_list(Node h1, Node h2){
        if(h1==null) return h2;
        if(h2==null) return h1;
        Node ans = new Node(Integer.MIN_VALUE);
        Node res = ans;
        int c=0;
        while(h1!=null || h2!=null ||c!=0){
            int sum = c;
            if(h1!=null){
                sum+=h1.val;
                h1 = h1.next;
            }
            if(h2!=null){
                sum+=h2.val;
                h2 = h2.next;
            }
            c = sum/10;
            ans.next = new Node(sum%10);
            ans = ans.next;
        }
        return res.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        Node ptr1 = new Node(0);
        Node ptr2 = new Node(0);
        Node head1 = ptr1;
        Node head2 = ptr2;
        while(n1>0){
            head1.next = new Node(sc.nextInt());
            head1 = head1.next;
            n1--;
        }
        int n2 = sc.nextInt();
        while(n2>0){
            head2.next = new Node(sc.nextInt());
            head2 = head2.next;
            n2--;
        }
        Node r1  = rev(ptr1.next);
        Node r2 = rev(ptr2.next);
        Node res = add_list(r1, r2);
        res = rev(res);
        while(res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
        sc.close();
    }
}
