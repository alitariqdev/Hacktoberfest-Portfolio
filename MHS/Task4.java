/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author Ehsaan
 */
public class Task4 {

    static Stack<Integer> numStack = new Stack<>();
    static Stack<Character> opStack = new Stack<>();

    public static void evaluate() {
        if (opStack.peek() == '+') {
            numStack.push(numStack.pop() + numStack.pop());
        } else if (opStack.peek() == '-') {
            numStack.push(-(numStack.pop()) + numStack.pop());
        } else if (opStack.peek() == '*') {
            numStack.push(numStack.pop() * numStack.pop());
        } else if (opStack.peek() == '/') {
            int denominator = numStack.pop();
            numStack.push(numStack.pop() / denominator);
        }
    }

    public static int evaluateExpression(String ex) {
        int calculate = 0;
        String num = "";
        boolean flag = false;
        for (int i = 0; i < (ex.length()); i++) {

            if (ex.charAt(i) >= '0' && ex.charAt(i) <= '9') {
                if (i < (ex.length() - 1) && ex.charAt(i + 1) >= '0' && ex.charAt(i + 1) <= '9') {
                    num = num + ex.charAt(i);
                } else {
                    num = num + ex.charAt(i);
                    numStack.push(Integer.parseInt(num));
                    if (!opStack.empty()) {
                        if (opStack.peek() == '(') {
                            flag = true;
                        }

                        if (flag == false) {
                            if (opStack.peek() == '/') {
                                evaluate();
                                opStack.pop();
                            } else if (opStack.peek() == '*') {
                                evaluate();
                                opStack.pop();
                            }
                        }

                    }
                }
            } else if (ex.charAt(i) == '+' || ex.charAt(i) == '-' || ex.charAt(i) == '*' || ex.charAt(i) == '/' || ex.charAt(i) == '(' || ex.charAt(i) == ')') {
                opStack.push(ex.charAt(i));
                if (opStack.peek() == ')') {
                    opStack.pop();
                    while (opStack.peek() != '(') {
                        evaluate();
                        opStack.pop();
                    }
                    opStack.pop();
                    flag = false;
                }
                num = "";
            }
        }
        while (!opStack.isEmpty()) {
            evaluate();
            opStack.pop();
        }
        calculate = numStack.pop();
        return calculate;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Expression: ");
        String expression = input.next();
        int result = evaluateExpression(expression);
        System.out.print("Result is: " + result);
    }
}