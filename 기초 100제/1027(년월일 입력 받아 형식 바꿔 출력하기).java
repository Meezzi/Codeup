import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("\\.");

        System.out.format(arr[2] + "-" + arr[1] + "-" + arr[0]);
    }
}
