package review.LinkedList;

public class SinglyLinkedList {
    private Node newNode;
    private Node head;
    private Node curr;
    private Node prev;

    // เพิ่ม Node ใน linkedlist (เพิ่มไปที่ตัวแรก)
    public void add(Object newItem) {
        if (head == null) {
            newNode = new Node(newItem);
        } else {
            newNode = new Node(newItem, head);
        }
        head = newNode;
    }

    // ค้นหา item ว่ามีใน linkedlist หรือไม่
    public boolean searchItem(Object item) {
        curr = head;
        prev = null;
        boolean status = false;

        while (curr != null) {
            if (curr.getItem() == item) {
                status = true;
                break;
            } else {
                prev = curr;
                curr = curr.getNext();
            }
        }

        return status;
    }

    // ลบ Node ด้วย item ที่รับเข้ามา
    public void deleteNode(Object item) {
        if (searchItem(item)) {
            if (prev == null) {
                head = curr.getNext();
            } else {
                prev.setNext(curr.getNext());
            }
            curr.setNext(null);
        } else {
            System.out.println("Not found item.");
        }
    }

    // แทรก Node ใน LinkedList
    public void insert(Object itemInsert, Object newItem) {
        newNode = new Node(newItem);
        if (searchItem(itemInsert)) {
            if (prev == null) {
                newNode.setNext(curr);
                head = newNode;
            } else {
                newNode.setNext(curr);
                prev.setNext(newNode);
            }
        } else {
            if (head == null) {
                newNode.setNext(curr);
                head = newNode;
            } else if (curr == null) {
                prev.setNext(newNode);
            }
        }
    }

    // แสดงข้อมูลใน LinkedList
    public void showData() {
        curr = head;
        while (curr != null) {
            System.out.print(curr.getItem() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
