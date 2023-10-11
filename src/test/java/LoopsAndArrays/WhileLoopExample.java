package LoopsAndArrays;

public class WhileLoopExample { // File Processing
    public static void main(String[] args) {
        int currentLine = 1;
        boolean fileContinues = true;

        while (fileContinues) {
            String line = readLineFromFile(currentLine);

            if (line == null) {
                // We have reached the end of the file
                // Return null to indicate end of file
                fileContinues = false;
            } else if (line.contains("important text")) {
                // Process the current line containing important text
                processLine(line);
            } else {
                // Skip the current line and move to the next one
                currentLine++;
                continue;
            }

            // Move to the next line in the file
            currentLine++;
        }
    }

    private static String readLineFromFile(int lineNumber) {
        // Code for reading a line from the file
        // Returns the content of the line or null if we have reached the end of the file
        // ...
    return "Te-am pus aici doar pentru ca imi stricai restul testelor, jesus fking christ.";
    }

    private static void processLine(String line) {
        // Code for processing the line
        // ...
    }
}
