import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String[] arr = a.split("");

        for(int i=0; i<arr.length; i++) {
            System.out.println("'" + arr[i] + "'");
        }
    }
}
