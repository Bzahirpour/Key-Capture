# Key-Capture
A Java based program for capturing keystrokes and writing them to the terminal

Cybersecurity has become a growing concern as the number of cyberattacks continues to rise globally. Understanding adversarial tactics, such as keystroke logging, is crucial in defending against these threats. This project was designed to deepen my understanding of these tactics by creating a basic keystroke recording program. The goal is to use this project as an educational tool to raise awareness in the community about the potential dangers of keystroke logging and how adversaries might exploit this technique. The program captures keystrokes in real-time and allows users to see the sequence of keys they have pressed, thereby simulating a basic form of what a malicious keylogger might do. By developing and testing this program, I aim to enhance knowledge about cybersecurity risks and foster a culture of vigilance and informed defense strategies.



Scenario 1: User presses the keys 'a', 'b', and 'c' in sequence:

The user starts the program, and it prompts them to begin recording keystrokes.
The user presses the 'a' key, followed by the 'b' and 'c' keys.
The program appends each key to the output string as they are pressed.
The console displays "Keys Pressed: abc" in a single line.
Scenario 2: User presses 'a', 'Escape', and 'c':

The user starts the program, and it prompts them to begin recording keystrokes.
The user presses the 'a' key.
The program appends 'a' to the output string and displays "Keys Pressed: a".
The user then presses the 'Escape' key.
The program recognizes the 'Escape' key and exits, displaying "Exiting..." before terminating.



Pseudocode

1. Start the program.
2. Initialize an empty StringBuilder to store the keystrokes.
3. Display a prompt indicating that keystroke recording has started and the user should press 'Escape' to exit.
4. Enter a loop to continuously read user input:
   a. Read the next key pressed by the user.
   b. If the key is 'Escape':
      i. Print "Exiting..." and exit the loop.
   c. Otherwise:
      i. Append the key to the StringBuilder.
      ii. Clear the console line and print the updated StringBuilder content.
5. End the program.



During the development of the keystroke recording program, I encountered several errors that required troubleshooting and debugging.

Error 1: Incorrect Handling of Non-Printable Characters
Description: When testing the program, I noticed that pressing certain keys such as 'Enter' or 'Backspace' resulted in unexpected behavior. For instance, pressing 'Enter' added a new line instead of continuing the key sequence on the same line, which disrupted the continuous output display.
Solution: To resolve this issue, I added a conditional check to ignore non-printable characters like 'Enter' or 'Backspace'. This allowed the program to maintain a consistent and clean output of the key sequence.

Error 2: Inconsistent Exit Behavior
Description: Initially, the program did not exit smoothly when the 'Escape' key was pressed. Sometimes, it required pressing 'Escape' multiple times or pressing another key afterward to trigger the exit.
Solution: The issue was traced to the handling of the escape sequence. I modified the exit condition to check specifically for the 'Escape' key followed by a 'newline' character. This ensured that the program would exit immediately and consistently upon detecting the 'Escape' key press.

These errors and the process of fixing them were instrumental in refining the program and ensuring it met its intended functionality. Through this iterative process, I was able to develop a more robust and reliable keystroke recording application.

