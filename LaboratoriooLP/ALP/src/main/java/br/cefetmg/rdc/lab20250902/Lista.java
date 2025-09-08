public interface Lista<T> {
    void add(T v);
    T get(int i);
    void remove(int i);
    int size();
    boolean isEmpty();
}
