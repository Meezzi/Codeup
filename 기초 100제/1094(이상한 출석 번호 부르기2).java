import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");

        for(int i=s.length-1; i>=0; i--) {
            System.out.print(s[i] + " ");
        }
    }
}
