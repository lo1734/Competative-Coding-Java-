import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicatesList {


    public static Node remDuplicate(Node head){
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = head;

        if(head==null || head.next == null) return head;
        Node prev = dummy;
        while(head!=null){
            if(head.next!=null && head.val == head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
    public static Node remDuplicate2(Node head){

        if(head==null || head.next == null) return head;
        Node dummy = new Node(Integer.MIN_VALUE);
        dummy.next = head;

        Node prev = dummy;
        while(head!=null){
            if(head.next!=null && head.val == head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }else{
                prev = prev.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(Integer.MIN_VALUE);
        Node ptr = head;
        System.out.print("Enter the size of linked list: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements: ");
        while(n-- >0){
            int val = sc.nextInt();
            head.next = new Node(val);
            head = head.next;
        }

        Node res = remDuplicate2(ptr.next);
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
    }
}
