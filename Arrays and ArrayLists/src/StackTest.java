import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

//        stack.pop();
        stack.remove(2);
        System.out.println(stack);
    }
}
