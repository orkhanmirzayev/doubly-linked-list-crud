
class DoublyLinkedList {

    Node head;

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }

    public void addNodeToFront(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public void addToMiddle(int newData,int position){
        Node newNode = new Node(newData);
        while (head.next.data != position) {
            head = head.next;
        }
        Node existingHeadAfter = head;
        head.next=newNode;
        newNode.prev=head;
        newNode.next=existingHeadAfter;
        existingHeadAfter.prev=newNode;

    }
    public void addNodeToLast(int newData) {
        Node newNode = new Node(newData);
        while (head.next != null) {
            head = head.next;
        }
        head.next=newNode;
        newNode.prev = head;
        newNode.next=null;

    }


    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.head = new Node(1000);
        list.addNodeToFront(1001);
        list.addNodeToFront(1002);
        list.addNodeToLast(1006);
        System.out.println();

    }

}
