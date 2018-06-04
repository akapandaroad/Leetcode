import java.util.Stack;

/**
 * Created by akapandaroad on 2018-06-03.
 */
import java.util.Stack;


public class Easy_12_682 {

    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        Stack<Integer> stack = new Stack<>();

        int result=0;

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {

                stack.remove(stack.peek());//stack.pop();
            }
            else if (ops[i].equals("D")) {

                stack.push(2 * stack.peek());
            }
            else if (ops[i].equals("+")) {

                int top = stack.pop();
                int secondTop = stack.peek();
                stack.push(top);
                stack.push(top + secondTop);

            } else {
                stack.push(Integer.parseInt(ops[i]));
            }


        }


        for (int a:
             stack)
        result+=a;
            System.out.println(result);
    }
}



