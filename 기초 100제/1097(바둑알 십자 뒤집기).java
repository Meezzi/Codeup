import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[20][20];

        for(int i=1; i<20; i++) {
            String[] a = br.readLine().split(" ");
            for(int j=0; j<a.length; j++) {
                arr[i][j+1] = Integer.parseInt(a[j]);
            }
        }

        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            for(int j=1; j<20; j++) {
                if(arr[n1][j] == 0) arr[n1][j]=1;
                else arr[n1][j] = 0;
            }

            for(int j=1; j<20; j++) {
                if(arr[j][n2] == 0) arr[j][n2] = 1;
                else arr[j][n2] = 0;
            }
        }

        for(int i=1; i<20; i++) {
            for(int j=1; j<20; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
