import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<a; i++) {
            cnt += i;
            if(cnt>=a) {
                System.out.print(i); break;}
        }
    }
}
