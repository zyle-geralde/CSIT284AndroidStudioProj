package com.example.androidprojectcollection;

import java.util.Stack;

public class MyClalcClass {

    public static double evaluateMDAS(String equation) {
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();


        int index = 0;
        while (index < equation.length()) {
            char c = equation.charAt(index);
            if (Character.isDigit(c) || c == '.') {

                StringBuilder operandBuilder = new StringBuilder();
                while (index < equation.length() && (Character.isDigit(equation.charAt(index)) || equation.charAt(index) == '.')) {
                    operandBuilder.append(equation.charAt(index));
                    index++;
                }
                double operand = Double.parseDouble(operandBuilder.toString());
                operandStack.push(operand);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {

                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(c)) {
                    applyOperation(operandStack, operatorStack);
                }
                operatorStack.push(c);
                index++;
            } else {

                index++;
            }
        }


        while (!operatorStack.isEmpty()) {
            applyOperation(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static void applyOperation(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1; // Invalid operator
        }
    }
}