import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] stu = new int[24];

        for(int i=0; i<n; i++) {
            stu[Integer.parseInt(s[i])] +=1;
        }

        for(int i=1; i<stu.length; i++) {
            System.out.print(stu[i] + " ");
        }
    }
}
