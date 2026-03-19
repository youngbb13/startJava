import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writerTest = new FileWriter("src/test.txt");
            writerTest.write("Hello!");
            writerTest.close();
            System.out.println("File created and writed!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}