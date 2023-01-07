import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String arr[] = a.split("-");

        System.out.print(arr[0] + arr[1]);
    }
}
