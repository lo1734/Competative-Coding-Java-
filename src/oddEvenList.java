//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//        this.next = next;
//    }
//}
public class oddEvenList {


    public  static Node oE_List(Node head){
        Node temp = head;
        Node odd = new Node(-1);
        Node o_res = odd;
        Node even = new Node(-1);
        Node e_res = even;
        while(temp!=null){
            if(temp.val%2==1){
                odd.next = temp;
                odd = odd.next;
            }else {
                even.next = temp;
                even = even.next;
            }
            temp = temp.next;
        }
        odd.next = e_res.next;
        even.next = null;
        return o_res.next;
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
        head.next = new Node(7);

        Node temp = oE_List(ptr);

        while(temp!=null) {
            System.out.print(temp.val + ((temp.next!=null) ? "->" : ""));
            temp = temp.next;
        }
    }
}
