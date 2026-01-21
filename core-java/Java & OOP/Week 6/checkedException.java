import java.io.IOException;

public class checkedException {
    void readData() throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try {
            checkedException c1 = new checkedException();
            c1.readData();
        } catch(IOException e) {
            System.out.println("Exception Handled");
        }
    }
}
