import java.util.Scanner;

public class palindromeList {

    public static Node rev(Node head){
        Node prev = null;
        Node ptr = head;
        while(ptr!=null){
            Node temp = ptr.next;
            ptr.next = prev;
            prev = ptr;
            ptr = temp;
        }
        return prev;
    }
    public static boolean palin(Node head){
        if(head==null) return  false;
        Node slow = head;
        Node fast = head;
        Node ptr = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = rev(slow.next);
        while(ptr!=null && temp!=null){
            if(ptr.val != temp.val) return false;
            ptr = ptr.next;
            temp = temp.next;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(Integer.MIN_VALUE);
        Node ptr = head;
        System.out.print("Enter the size of linked list: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<size;i++){
            int temp = sc.nextInt();
            head.next = new Node(temp);
            head = head.next;
        }

        boolean res = palin(ptr.next);
        if(res == false) System.out.println("List is not a palindrome.");
        else System.out.println("List is palindrome.");

    }
}
