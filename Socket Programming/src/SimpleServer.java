import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

    public static void main(String[] args) throws IOException {

        int portNumber = 8000;

        ServerSocket server = new ServerSocket(portNumber);

        System.out.println("Server started at port number = "+ portNumber);

        Socket client = server.accept();

        System.out.println("Client connected!");

        PrintWriter out = new PrintWriter(client.getOutputStream());

        out.write("Welcome"+"\n");
        out.write("what is your name "+"\n");
        out.flush();


        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String name = in.readLine();

        out.write("Welcome "+ name+"\n");

        out.flush();

    }
}
