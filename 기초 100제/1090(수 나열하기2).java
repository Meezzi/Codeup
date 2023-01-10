import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long res = a;

        for(int i=1; i<n; i++) {
            res *=r;
        }
        System.out.print(res);
    }
}
