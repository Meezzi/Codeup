import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        char cha = a.charAt(0);

        for(char i='a'; i<=cha; i++) {
            System.out.print(i + " ");
        }
    }
}
