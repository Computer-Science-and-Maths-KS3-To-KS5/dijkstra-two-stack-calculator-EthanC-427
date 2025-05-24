import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> digits = new ArrayList<>(Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9'));//define digits 0-9
        ArrayList<Character> operators = new ArrayList<>(Arrays.asList('+', '-', '*', '/'));//define operators

        //input the equation
        System.out.print("Please enter the equation: ");
        String equation = in.nextLine();

        //instantiate the two stacks
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        double left;
        char operator;
        double right;
        double result = 0;

        for(Character currentSymbol : equation.toCharArray())//for each character in the equation
        {
            if(digits.contains(currentSymbol))//if it is a digit
            {
                operandStack.push((double)Integer.parseInt(currentSymbol.toString()));//push it onto the operand stack
            }

            else if(operators.contains(currentSymbol))//else if it is an operator
            {
                operatorStack.push(currentSymbol);//push it onto the operator stack
            }

            else if(currentSymbol == ')')//else if it is a right bracket
            {
                operator = operatorStack.pop();//pop an item from the operator stack

                //pop two items from the operand stack
                right = operandStack.pop();
                left = operandStack.pop();

                switch(operator)//switch statement with the contents of operator
                {//perform the operation and store the value in result
                    case '+':
                        result = left + right;
                        break;

                    case '-':
                        result = left - right;
                        break;

                    case '*':
                        result = left * right;
                        break;

                    case '/':
                        result = left / right;
                        break;
                }

                operandStack.push(result);
            }//else skip the character
        }

        System.out.println(operandStack.pop());//pop an item from the operand stack and print it
    }
}
