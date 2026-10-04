import java.util.*;
//
//class node{
//    int val;
//    node next;
//    node(int val){
//        this.val = val;
//        this.next = null;
//    }
//}
public class _27_partionList {

    public static Node p_list(Node head, int k){
        if(head==null) return head;
        Node l = new Node(0);
        Node r = new Node(0);
        Node a = l;
        Node b = r;
        while(head!=null){
            if(head.val<k) {
                l.next = new Node(head.val);
                l = l.next;
            }
            else {
                r.next = new Node(head.val);
                r = r.next;
            }
            head = head.next;
        }
        l.next = b.next;
        r.next = null;
        return a.next;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node ptr = new Node(0);
        Node head = ptr;
        int n = sc.nextInt();
        while(n>0){
            ptr.next = new Node(sc.nextInt());
            ptr = ptr.next;
            n--;
        }
        int k = sc.nextInt();
        Node res = p_list(head.next, k);
        while(res!=null){
            System.out.print(res.val+ " ");
            res = res.next;
        }
    }
}
