import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Integer.parseInt(br.readLine());

        System.out.print(~a);
    }
}
