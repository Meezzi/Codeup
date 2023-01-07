import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float a = Float.parseFloat(br.readLine());

        System.out.format("%.2f", a);
    }
}
