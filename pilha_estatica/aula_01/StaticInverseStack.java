package pilha_estatica.aula_01;

public class StaticInverseStack<T> implements Stackable<T> {

    private T[] data;
    private int pointerTop;
    private int length;

    public StaticInverseStack(int length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid value");
        }
        this.length = length;
        this.pointerTop = length;
        data = (T[]) new Object[length];
    }

    @Override
    public void push(T item) {

        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }

        pointerTop--;
        data[pointerTop] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        T item = data[pointerTop];
        pointerTop++;
        return item;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        T item = data[pointerTop];
        return item;
    }

    public boolean isEmpty() {
        return pointerTop == length;
    }

    public boolean isFull() {

        return pointerTop == 0;
    }

    public void print() {
        String str = "";

        if (isEmpty()) {
            System.out.println("Is empty");
            return;
        }

        for (T item : data) {
            str += ",";
            str += item.toString();
        }

        str = str.substring(1);
        System.out.println("[" + str + "]");
    }
}
