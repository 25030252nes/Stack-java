import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println(buscar(pila, 20));
    }

    static boolean buscar(Stack<Integer> pila, int dato) {
        for (int x : pila) {
            if (x == dato) {
                return true;
            }
        }
        return false;
    }
}