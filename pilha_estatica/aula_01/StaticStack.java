package pilha_estatica.aula_01;

public class StaticStack implements Stackable {

    private Object[] data;
    private int pointerTop = -1;
    private int length;

    public StaticStack(int length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid value");
        }
        this.length = length;
        data = new Object[length];
    }

    @Override
    public void push(Object item) {

        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }

        pointerTop++;
        data[pointerTop] = item;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        Object item = data[pointerTop];
        pointerTop--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        Object item = data[pointerTop];
        pointerTop--;
        return item;
    }

    private boolean isEmpty() {
        return pointerTop == -1;
    }

    private boolean isFull() {

        return pointerTop + 1 == length;
    }

    public void print() {
        String str = "";

        if (isEmpty()) {
            System.out.println("Is empty");
            return;
        }

        for (Object object : data) {
            str += ",";
            str += object.toString();
        }

        str = str.substring(1);
        System.out.println("[" + str + "]");
    }
}
