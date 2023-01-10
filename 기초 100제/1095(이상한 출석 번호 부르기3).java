import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int min=23;

        for(int i=0; i<s.length; i++) {
            min = Math.min(Integer.parseInt(s[i]), min);
        }
        System.out.print(min);
    }
}
