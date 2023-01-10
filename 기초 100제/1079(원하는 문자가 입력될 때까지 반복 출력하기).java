import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] arr = a.split(" ");
        int i=0;
        while(true) {
            System.out.println(arr[i]);
            if(Objects.equals(arr[i], "q"))
                break;
            i= i+ 1;
        }
    }
}
