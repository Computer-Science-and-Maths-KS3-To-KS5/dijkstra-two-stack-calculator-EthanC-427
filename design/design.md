# Design
## User interface
The program will use a text user interface.
This has been chosen for the following reasons:
- It is relatively simple to implement
- It allows for intuitive input of the equation

## Pseudocode
```
Instantiate operator stack and operand stack

For each character in the equation
    If it is a digit (0-9), push it onto the operand stack
    Else if it is an operator, push it onto the operator stack

    Else if it is a right bracket
        Pop an operator from the operator stack, store it in a char variable "operator"
        Pop an operand from the operand stack, store it in an int variable "right"
        Pop an operand from the operand stack, store it in an int variable "left"

        Switch statement with the contents of "operator"
            If it is a '+', calculate "left" + "right", store it in "result"
            If it is a '-', calculate "left" - "right", store it in "result"
            If it is a '*', calculate "left" * "right", store it in "result"
            If it is a '/', calculate "left" / "right", store it in "result"
        End switch

        Push "result" to the operand stack
    Else skip the character
    End if
End for

Pop an item from the operand stack and print it
```
