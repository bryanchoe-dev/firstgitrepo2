import java.io.*;
import java.net.*;

public class ObjectCalculatorServer {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            System.out.println("클라이언트의 접속 대기중...");
            socket = serverSocket.accept();

            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());

            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                SendData data = (SendData) obj;
                int num1 = data.getNum1();
                int num2 = data.getNum2();
                String operator = data.getOperator();

                if (operator.equals("+")) {
                    oos.writeObject(num1 + " + " + num2 + " = " + (num1 + num2));
                } else if (operator.equals("-")) {
                    oos.writeObject(num1 + " - " + num2 + " = " + (num1 - num2));
                } else if (operator.equals("*")) {
                    oos.writeObject(num1 + " * " + num2 + " = " + (num1 * num2));
                } else if (operator.equals("/")) {
                    oos.writeObject(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                oos.flush();
                System.out.println("결과를 전송했습니다.");
            }
        } catch (EOFException e) {
            System.out.println("클라이언트의 접속이 종료되었습니다.");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            try {
                if (ois != null) ois.close();
                if (oos != null) oos.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
    }
}
