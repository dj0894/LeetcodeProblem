import java.util.LinkedList;
//https://www.geeksforgeeks.org/reverse-a-list-in-groups-of-given-size/
//Input: 1->2->3->4->5->6->7->8->NULL, K = 3
//        Output: 3->2->1->6->5->4->8->7->NULL
//        Input: 1->2->3->4->5->6->7->8->NULL, K = 5
//        Output: 5->4->3->2->1->8->7->6->NULL

public class ReverseLinkedList3 {


    public static void main(String args[]){

        LinkedList1 llist = new LinkedList1();
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.printList();

        llist.head = llist.reverse(llist.head, 3);
        llist.printList();

    }

}

class LinkedList1{
    Node head;

    public Node reverse(Node head, int k) {
        if(head==null){
            return null;
        }

        int count=0;
        Node curr=head;
        Node prev=null;
        Node third=null;
        while(count<k&&curr!=null){
            third=curr.next;
            curr.next=prev;
            prev=curr;
            curr=third;
            count++;
        }

        if(third!=null) {
            head.next = reverse(third, k);
        }

        return prev;
        }


    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}




