package courses.exercice3;

import java.util.Stack;

public class ReverseCalculatorService {

    public int reverseCalculator(String[] content) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < content.length; i++) {

            switch (content[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(stack.pop() - stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    stack.push(stack.pop() / stack.pop());
                    break;
                default:
                    stack.push(Integer.parseInt(content[i]));
            }

        }
        return stack.pop();
    }
}
