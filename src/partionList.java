import java.util.*;

public class partionList {

    public static Node fun(Node head, int x){
        Node res = new Node(Integer.MIN_VALUE);
        Node p1 = new Node(Integer.MIN_VALUE);
        Node p2 = new Node(Integer.MIN_VALUE);
        Node ptr1 = p1;
        Node ptr2 = p2;
        while(head!=null){
            if(head.val<x){
                p1.next = new Node(head.val);
                p1 = p1.next;
            }else{
                p2.next = new Node(head.val);
                p2 = p2.next;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = ptr2.next;
        res.next = ptr1.next;
        return res.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node ptr1 = new Node(Integer.MIN_VALUE);
        Node head1 = ptr1;
        while(sc.hasNextInt()){
            int k = sc.nextInt();
            if(k==-1){
                ptr1.next = null;
                break;
            }
            ptr1.next = new Node(k);
            ptr1 = ptr1.next;
        }
        int t = sc.nextInt();
        Node res = fun(head1.next,t);
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
        sc.close();
    }
}
