import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

// ) Write a java socket programming in which client sends a text and server receives

public class A11 {

    static class server {
        public void run() {
            try {
                ServerSocket server_socket = new ServerSocket(2024);

                Socket client = server_socket.accept();

                InputStreamReader reader = new InputStreamReader(client.getInputStream());

                BufferedReader buffer = new BufferedReader(reader);

                System.out.println("query: ");
                while (buffer != null) {
                    System.out.print(buffer.readLine());
                }
                System.out.println("EOP...");

            } catch (Exception e) {

            }

        }

    }

    static class client {
        public void run() throws Exception {
            Socket user = new Socket("localhost", 2024);

            OutputStream out = user.getOutputStream();

            PrintStream str = new PrintStream(out);
            System.out.println("enter your Message ");

            var sc = new java.util.Scanner(System.in).nextLine();

            str.println(sc);

            System.out.println("EOP...");

        }
    }

    public static void main(String ar[]) throws Exception {
        if (ar[0].equals("server")) {
            new server().run();
        } else {
            new client().run();
        }
    }
}