//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//        this.next = null;
//    }
//}
public class rotateList {

    public static int getLen(Node head){
        if(head==null) return 0;
        return 1+getLen(head.next);
    }
    public static Node rotList(Node head, int k){
        int n = getLen(head);
        k = k % n;
        if(k==0) return head;
        Node prev = null;
        Node ptr = head;
        while(k>0){
            prev = ptr;
            ptr = ptr.next;
            k--;
        }
        prev.next = null;
        Node temp = ptr;
        while(temp.next!=null) temp = temp.next;
        temp.next = head;

        return ptr;
    }

    public static void main(String[] args){
        Node head = new Node(0);
        Node ptr = head;
        head.next = new Node(1); head = head.next;
        head.next = new Node(2);head = head.next;
        head.next = new Node(3);head = head.next;
        head.next = new Node(4);head = head.next;
        head.next = new Node(5);head = head.next;
        head.next = new Node(6);head = head.next;
        head.next = new Node(7);head = head.next;
        int k = 2;
        Node res = rotList(ptr,k);
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
    }

}
