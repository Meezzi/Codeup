import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(":");

        if(Objects.equals(arr[1], "00")) {
            arr[1] = "0";
        }
        System.out.println(arr[1]);
    }
}
