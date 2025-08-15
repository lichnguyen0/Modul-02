package trienkhaicacphuongthuccuaarraylisttheothuvien;



public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    //contrus mặc định
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //contruc kích thước ban đâu
    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    //them phan tu
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        //kiểm tra mảng nếu đầy thì mở rong
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        // di chuyen cac phan tu sang phai
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        // them phan tu
        elements[index] = element;
        size++;
    }

    // xoa phan tu
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        E removed = (E) elements[index];

        // Di chuyển phần tử sang trái
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
        return removed;
    }

    // thay kich thuoc list
    public int size() {
        return size;
    }

    //sao chép list
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>(elements.length);
        newList.size = size;
        for (int i = 0; i < size; i++) {
            newList.elements[i] = elements[i];
        }
        return newList;
    }

    //kiem tra phan tu co ton tai
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    // Tìm vi tri phan tu
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }


    // thêm vào cuoi list
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
        return true;
    }


    public void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    // lay phan tu tai vi tri
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i);
        }
        return (E) elements[i];
    }

    // Xóa all danh sach
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

}
