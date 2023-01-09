import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        for(int i=0; i<str.length; i++) {
            if(Objects.equals(str[i], "0")) 
                break;
            System.out.println(str[i]);
        }
    }
}
