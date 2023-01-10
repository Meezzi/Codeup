import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for(int i=1; i<=a; i++) {
            if(i%3==0) {
                System.out.print("X ");
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
