import java.util.Scanner;

public class mergeTwoSortedLists {

    public static Node merge(Node head1, Node head2){
        Node temp = new Node(Integer.MIN_VALUE);
        Node res = temp;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while(head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2!= null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return res.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node head1 = new Node(Integer.MIN_VALUE);
        Node head2 = new Node(Integer.MIN_VALUE);
        Node ptr1 = head1;
        Node ptr2 = head2;
        System.out.print("Enter the size of  list1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<size1;i++){
            int temp = sc.nextInt();
            head1.next = new Node(temp);
            head1 = head1.next;
        }
        System.out.print("Enter the size of  list2: ");
        int size2 = sc.nextInt();
        for(int i=0;i<size2;i++){
            int temp = sc.nextInt();
            head2.next = new Node(temp);
            head2 = head2.next;
        }
        Node res = merge(ptr1.next,ptr2.next);
        while(res!=null){
            System.out.print(res.val + ((res.next!=null)?"->":""));
            res = res.next;
        }

    }
}
