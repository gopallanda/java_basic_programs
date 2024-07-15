import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println("enter a double value");
        double d = Double.parseDouble(br.readLine());
        System.out.println("enter a byte value");
        byte b = Byte.parseByte(br.readLine());
        System.out.println("enter a short value");
        short s = Short.parseShort(br.readLine());

        System.out.println(x + " " + d + " " + b + " " + s);

    }

}
