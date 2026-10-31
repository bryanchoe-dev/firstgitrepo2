import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) {
        UDPServer ut1 = new UDPServer();
        ut1.service();
    }

    public void service() {
        try {
            DatagramSocket dsocket = new DatagramSocket(5432);
            byte[] buff = new byte[1024];

            DatagramPacket recvPacket = new DatagramPacket(buff, buff.length);
            dsocket.receive(recvPacket);

            String recvMsg = new String(recvPacket.getData());
            System.out.println("받은 메시지 : " + recvMsg);

            dsocket.close();

        } catch (IOException ie) {
            System.out.println(ie);
        }
    }
}
