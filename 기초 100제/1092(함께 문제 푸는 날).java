import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int res = 0;

        for(int i=1; i<=a*b*c; i++) {
            if(i%a==0 && i%b==0 && i%c==0 ) {
                System.out.print(i);
                break;
            }
        }
    }
}
