import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        OutputStream os = null;
        DataOutputStream dos = null;
        String msg = "Hello, Client";
        try {
            server = new ServerSocket(7777);
            System.out.println("Wait Client......");
            socket = server.accept();
            System.out.println("Client Connection Success");
            System.out.println("server socket : "
                    + socket.getInetAddress().getHostAddress());
            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            dos.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
