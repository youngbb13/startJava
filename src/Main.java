import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("src/test.txt", true)) {
            myWriter.write("\nAppended text!");
            System.out.println("Text appended!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}