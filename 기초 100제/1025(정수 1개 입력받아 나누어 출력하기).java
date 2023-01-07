import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split("");

        System.out.println("[" + Integer.parseInt(arr[0])*10000 + "]");
        System.out.println("[" + Integer.parseInt(arr[1])*1000 + "]");
        System.out.println("[" + Integer.parseInt(arr[2])*100 + "]");
        System.out.println("[" + Integer.parseInt(arr[3])*10 + "]");
        System.out.println("[" + Integer.parseInt(arr[4]) + "]");

    }
}
