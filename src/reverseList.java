import java.util.Scanner;

//class Node{
//    int val;
//    Node next;
//
//    Node(int val){
//        this.val = val;
//        this.next = null;
//    }
//}
public class reverseList {

    public static Node revList(Node head){
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(0);
        Node ptr = head;
        head.next = new Node(1); head = head.next;
        head.next = new Node(2);head = head.next;
        head.next = new Node(3);head = head.next;
        head.next = new Node(4);head = head.next;
        head.next = new Node(5);head = head.next;
        head.next = new Node(6);head = head.next;
        head.next = new Node(7);

        Node res = revList(ptr);
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
    }
}
