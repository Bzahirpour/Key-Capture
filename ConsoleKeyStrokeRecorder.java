import java.io.IOException;

public class ConsoleKeyStrokeRecorder {

    public static void main(String[] args) {
        // Inform the user that the recording has started
        System.out.println("Press any key to start recording (Press 'Escape' then 'Enter' to quit):");

        // StringBuilder to store the sequence of keys pressed
        StringBuilder recordedKeys = new StringBuilder();

        try {
            while (true) {
                // Read the next key press
                int key = System.in.read();

                // Solution for Error 2: Consistent Exit Behavior
                // Check if the key pressed is 'Escape' (ASCII 27) followed by 'Enter' (ASCII 10)
                if (key == 27) {
                    // Wait for the Enter key to confirm exit
                    int nextKey = System.in.read();
                    if (nextKey == 10) {
                        System.out.println("\nExiting...");
                        break; // Exit the loop and end the program
                    }
                }

                // Solution for Error 1: Handling Non-Printable Characters
                // Ignore non-printable characters such as Enter (ASCII 10) and Backspace (ASCII 8)
                if (key >= 32 && key <= 126) {  // Printable ASCII range
                    recordedKeys.append((char) key); // Append the pressed key to the StringBuilder
                }

                // Print the current sequence of keys
                System.out.print("\rKeys Pressed: " + recordedKeys.toString());
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle any I/O exceptions
        }
    }
}
