package trienkhaicacphuongthuccualinkedlisttheothuvien;

public class MyLinkedList<E> {

    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        numNodes++;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ: " + index);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Vị trí không hợp lệ: " + index);
        }

        if (index == 0) {
            E data = head.data;
            head = head.next;
            numNodes--;
            return data;
        }

        // xoa phan tu tai vi tri
        Node<E> current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        E data = current.next.data;
        current.next = current.next.next;
        numNodes--;
        return data;
    }

    //lay kich thuoc
    public int size() {
        return numNodes;
    }

    public boolean contains(E e) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}



