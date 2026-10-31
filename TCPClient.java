import java.net.*;
import java.io.*;

public class TCPClient {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream is = null;
        DataInputStream dis = null;
        String serverMsg = null;
        try {
            socket = new Socket("127.0.0.1", 7777);
            System.out.println("Server Connection Success");
            System.out.println("client socket : " + socket);
            is = socket.getInputStream();
            dis = new DataInputStream(is);
            serverMsg = new String(dis.readUTF());
            System.out.println("서버에서 전송된 메시지 : " + serverMsg);
            dis.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
