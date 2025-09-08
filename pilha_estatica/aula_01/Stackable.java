package pilha_estatica.aula_01;

public interface Stackable<T> {

    public void push(T item);

    public T peek();

    public T pop();

    public boolean isEmpty();

    public boolean isFull();

    public void print();

}