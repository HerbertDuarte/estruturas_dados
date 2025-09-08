package pilha_estatica.aula_01;

public class StackTest {
    public static void main(String[] args) throws Exception {
        Stackable<Integer> myStackable = new StaticStack<Integer>(3);

        myStackable.push(10);
        myStackable.push(11);
        myStackable.push(12);

        if (myStackable.peek() != 12)
            throw new Exception("peek fail");

        if (myStackable.peek() != 12)
            throw new Exception("peek fail");

        if (myStackable.pop() != 12)
            throw new Exception("pop fail");

        if (myStackable.pop() != 11)
            throw new Exception("pop fail");

        if (myStackable.pop() != 10)
            throw new Exception("pop fail");

        try {
            myStackable.pop();
            throw new IndexOutOfBoundsException("pop fail");

        } catch (Exception e) {
            if (e instanceof IndexOutOfBoundsException) {
                throw new Exception("pop fail");
            }
        }

        System.out.println("Test pass");
    }
}
