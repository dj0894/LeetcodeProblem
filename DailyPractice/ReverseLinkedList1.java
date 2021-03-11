public class ReverseLinkedList1 {


}

class LinkedList{
    Node head;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

       public void push(int data){
            Node newNode=null;
            if(head==null){
                newNode=new Node(data);
            }

           newNode.next=null;

       }

    }
}
