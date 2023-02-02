package Reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public void stop() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
