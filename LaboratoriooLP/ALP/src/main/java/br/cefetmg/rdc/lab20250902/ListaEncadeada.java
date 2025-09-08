public class ListaEncadeada<T> implements Lista<T> {
    private class Node {
        T val;
        Node next;
        Node(T v) { val = v; }
    }

    private Node head;
    private int n;

    public ListaEncadeada() {
        head = null;
        n = 0;
    }

    @Override
    public void add(T v) {
        Node novo = new Node(v);
        if (head == null) head = novo;
        else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = novo;
        }
        n++;
    }

    @Override
    public T get(int i) {
        if (i < 0 || i >= n) throw new IndexOutOfBoundsException();
        Node cur = head;
        for (int j = 0; j < i; j++) cur = cur.next;
        return cur.val;
    }

    @Override
    public void remove(int i) {
        if (i < 0 || i >= n) throw new IndexOutOfBoundsException();
        if (i == 0) head = head.next;
        else {
            Node cur = head;
            for (int j = 0; j < i - 1; j++) cur = cur.next;
            cur.next = cur.next.next;
        }
        n--;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }
}
