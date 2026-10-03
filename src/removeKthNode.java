import java.util.Scanner;

public class removeKthNode {

    public static int getLen(Node head){
        if(head == null) return 0;
        return 1+getLen(head.next);
    }
    public static Node remKthNode(Node head, int k){
        Node prev = null;
        Node ptr = head;
        int n = getLen(head);
        int t = n-k;
        if(t==0) return head.next;
        while(t-- >0){
            prev = ptr;
            ptr = ptr.next;
        }
        prev.next = ptr.next;
        return head;
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
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        Node res = remKthNode(ptr.next,k);
        while(res!=null){
            System.out.print(res.val + ((res.next!=null)?"->":""));
            res = res.next;
        }
    }
}
