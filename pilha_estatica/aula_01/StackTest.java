package pilha_estatica.aula_01;

public class StackTest {
    public static void main(String[] args) {
        Stackable myStackable = new StaticStack(3);

        myStackable.push(10);
        myStackable.push(11);
        myStackable.push(12);
        myStackable.push(12);
        myStackable.push(12);

        myStackable.print();
    }
}
