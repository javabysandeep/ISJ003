package misc;

public class TestList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(60);
        list.addFirst(70);
        list.addFirst(80);
        list.addFirst(90);
        list.traverse();
        System.out.println("Size of list "+list.size);
    }
}
