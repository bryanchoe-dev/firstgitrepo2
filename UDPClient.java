import java.net.*;
import java.io.*;

public class UDPClient {
    public static void main(String[] args) {
        UDPClient ut2 = new UDPClient();
        ut2.connection();
    }

    public void connection() {
        try {
            DatagramSocket dsocket = new DatagramSocket();
            String sendMsg = new String("Hello UDP Echo!!");
            byte[] buff = sendMsg.getBytes();
            InetAddress addr = InetAddress.getByName("127.0.0.1");

            DatagramPacket sendPacket =
                    new DatagramPacket(buff, buff.length, addr, 5432);
            dsocket.send(sendPacket);
            System.out.println("보낸 메시지 확인 출력 :" + sendMsg);
            dsocket.close();
        } catch (IOException ie) {
            System.out.println(ie);
        }
    }
}
