import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CounterWordServer slps = new CounterWordServer(10000, "bye", System.out);
        slps.start();
    }
}
