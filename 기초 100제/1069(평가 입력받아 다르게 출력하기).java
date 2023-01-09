import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();

        switch(a) {
            case "A" : System.out.println("best!!!"); break;
            case "B" : System.out.println("good!!"); break;
            case "C" : System.out.println("run!"); break;
            case "D" : System.out.println("slowly~"); break;
            default : System.out.println("what?"); break;
        }
    }
}
