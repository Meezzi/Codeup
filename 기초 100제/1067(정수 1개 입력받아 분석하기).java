import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if(a>=0) System.out.println("plus");
        else System.out.println("minus");
        if(a%2==0) System.out.println("even");
        else System.out.println("odd");
    }
}
