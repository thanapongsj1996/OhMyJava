package review.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.add(9);
        System.out.print("add 9 :  ");
        sl.showData();

        sl.add(10);
        System.out.print("add 10 :  ");
        sl.showData();

        sl.add(11);
        System.out.print("add 11 :  ");
        sl.showData();

        sl.add(12);
        System.out.print("add 12 :  ");
        sl.showData();

        sl.deleteNode(10);
        System.out.print("delete 10 :  ");
        sl.showData();

        sl.deleteNode(12);
        System.out.print("delete 12 :  ");
        sl.showData();

        sl.insert(11, 15);
        System.out.print("insert 15 before 11 :  ");
        sl.showData();

        sl.insert(11, 17);
        System.out.print("insert 17 before 11 :  ");
        sl.showData();

        sl.insert(18, 19);
        System.out.print("insert 19 at last :  ");
        sl.showData();
    }
}
