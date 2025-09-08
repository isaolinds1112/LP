import java.util.Arrays;

public class ListaArray<T> implements Lista<T> {
    private Object[] arr;
    private int n;

    public ListaArray() {
        arr = new Object[10];
        n = 0;
    }

    @Override
    public void add(T v) {
        if (n == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[n++] = v;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i < 0 || i >= n) throw new IndexOutOfBoundsException();
        return (T) arr[i];
    }

    @Override
    public void remove(int i) {
        if (i < 0 || i >= n) throw new IndexOutOfBoundsException();
        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
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
