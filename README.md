- Start the Program
The program begins by creating a Scanner object to read user input and sets a boolean flag running = true to keep the calculator active.
- Display Menu
Inside the loop, it prints a menu of operations (Add, Subtract, Multiply, etc.) and asks the user to choose one by entering a number.
- Read User Choice
The user enters a number (e.g., 1 for Add), which is stored in the variable choice.
- Perform Operation
The switch statement checks the value of choice and runs the corresponding block of code:
- For basic operations, it asks for two numbers and performs the calculation.
- For scientific operations (like sine or log), it asks for one number and uses Math functions.
- Handle Errors
For division, it checks if the second number is zero to avoid a crash. For other operations, it assumes valid input but you can add more checks if needed.
- Repeat or Exit
After showing the result, the loop repeats unless the user chooses option 12 (Exit), which sets running = false and ends the program.
