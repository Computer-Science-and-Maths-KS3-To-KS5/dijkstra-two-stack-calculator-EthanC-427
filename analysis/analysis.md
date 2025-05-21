# Analysis
## Description of the Dijkstra two stack calculator
The Dijkstra two stack calculator is an algorithm that evaluates an input equation in infix notation.
It uses two stacks as it reads the input equation: one for operators, and one for operands.

The input equation is read from left to right, and opening brackets are ignored.
On reaching a closing bracket, the algorithm will pop two operands from the operand stack and one operator from the operator stack.
The operation is then performed and the result is pushed back onto the operand stack.

After the algorithm completes, the result of the evaluation will be the only item in the operand stack.

## Objectives for the solution
1. The program should be able to accept the input equation after a prompt for user input
2. The program should correctly evaluate the equation
3. The program should display the result of the evaluation
