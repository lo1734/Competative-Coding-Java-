import java.util.Scanner;

public class swapNodesInList {


    public static Node swapNode(Node head, int k){
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(k-- >0){
            prev = fast;
            fast = fast.next;
        }

        Node temp = fast;
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }

        int t = prev.val;
        prev.val = slow.val;
        slow.val = t;
        return head;
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
        System.out.print("Enter the which element to swap: ");
        int k = sc.nextInt();
        Node res = swapNode(ptr.next,k);
        while(res!=null){
            System.out.print(res.val+((res.next!=null)?"->":""));
            res = res.next;
        }
    }
}
