import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String arr[] = a.split("\\.");

        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);

        System.out.println(A);
        System.out.println(B);
    }
}
