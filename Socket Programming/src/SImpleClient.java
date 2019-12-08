import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SImpleClient {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("localhost",8000);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream());

        String line1 = in.readLine();
        String line2 = in.readLine();

        System.out.println(line1);
        System.out.println(line2);

        out.write("Gorge+\n");
        out.flush();

        String line3 = in.readLine();
        System.out.println(line3);





    }
}
