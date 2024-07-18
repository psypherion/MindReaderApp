# MindReaderApp

Welcome to the **MindReaderApp**! This Java application demonstrates a simple mind-reading trick using a two-digit number. The application will ask you to think of a number, perform some mathematical operations on it, and then reveal a symbol associated with the result.

## Approach

The app leverages a mathematical property to "read your mind":

1. **Initial Number**: Think of any two-digit number, where `a` and `b` are the digits. The number can be expressed as `10a + b`.

2. **Reversed Number**: When you reverse the digits, the new number becomes `10b + a`.

3. **Subtraction**: Subtract the reversed number from the original number:
   \[
   (10a + b) - (10b + a) = 9a - 9b = 9(a - b)
   \]

   The result of this subtraction is always divisible by 9, regardless of the values of digits `a` and `b`. Thus, the result is always a multiple of 9, including 0.

4. **Symbol Mapping**: The application uses this property to map each possible result (0 through 99) to a symbol. When you click the "Submit" button, the app will reveal the symbol that corresponds to the number you calculated.

## Method of Use

1. **Download and Setup**:
   - Clone this repository using the command:
     ```bash
     git clone https://github.com/ky13troj/MindReaderApp.git
     ```
   - Navigate to the project directory:
     ```bash
     cd MindReaderApp
     ```

2. **Compile the Code**:
   - Make sure you have Java Development Kit (JDK) installed on your machine.
   - Compile the Java code using the following command:
     ```bash
     javac MindReaderApp.java
     ```

3. **Run the Application**:
   - Execute the compiled Java program:
     ```bash
     java MindReaderApp
     ```

4. **Using the App**:
   - Think of any two-digit number.
   - Reverse the digits and compute the difference between the original number and the reversed number.
   - Find the resulting number and locate the symbol associated with it on the grid displayed.
   - Click the "Submit" button to reveal the symbol.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any questions or feedback, feel free to reach out to me at [williamskyle562@gmail.com](mailto:williamskyle562@gmail.com).

Enjoy the magic!
