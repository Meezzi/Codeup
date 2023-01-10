import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        int hex = Integer.parseInt(a, 16);

        for(int i=1; i<16; i++) {
            System.out.format("%X*%X=%X\n", hex, i, hex*i);
        }

    }
}
