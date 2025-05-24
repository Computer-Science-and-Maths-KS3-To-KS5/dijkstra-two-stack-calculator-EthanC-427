# Testing
## Method of testing the program
I will test the program by comparing the program's output with the expected output for a given input.

## Running the tests
| Test number | Purpose of test | Input | Expected output | Actual output | Success or failure? |
|------------:|----------------:|------:|----------------:|--------------:|--------------------:|
| 1 | Testing basic input functionality | 1 | 1.0 | 1.0 | Success |
| 2 | Testing recognition of '(', '+' and ')' characters | (1+2) | 3.0 | 3.0 | Success |
| 3 | Testing recognition of '-' character | (3-1) | 2.0 | 2.0 | Success |
| 4 | Testing recognition of '*' character | (4*5) | 20.0 | 20.0 | Success |
| 5 | Testing recognition of '/' character | (6/3) | 2.0 | 2.0 | Success |
| 6 | Testing recognition of ' ' character | (4 + 2 ) | 6.0 | 6.0 | Success |
| 7 | Testing negative output | (2-5) | -3.0 | -3.0 | Success |
| 8 | Testing non-integer output | (2/5) | 0.4 | 0.4 | Success |
| 9 | Testing ability to handle multiple operations in order | ((2 + 5) * 7) | 49.0 | 49.0 | Success |
| 10 | Testing ability to handle multiple operations in reverse order | (2 + (5 * 7)) | 37.0 | 37.0 | Success |
| 11 | Further testing ability to handle multiple operations | (1 + ((2 + 3) * ( 4 * 5))) | 101.0 | 101.0 | Success |
