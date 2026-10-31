import java.io.*;
import java.net.Socket;

public class ObjectCalculationClient {
    public static void main(String[] args) {
        System.out.println("통신할 서버의 IP 주소를 정확히 입력하세요.");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(
                System.in));
        Socket socket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        int num1 = 0;
        int num2 = 0;
        String operator = null;

        try {
            socket = new Socket(keyboard.readLine(), 8888);

            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    System.in));

            String message = null;
            while (true) {
                System.out.println("첫 번째 숫자를 입력하세요.");
                message = reader.readLine();

                num1 = Integer.parseInt(message);
                System.out.println("두 번째 숫자를 입력하세요.");
                message = reader.readLine();
                num2 = Integer.parseInt(message);

                System.out.println("연산자를 입력하세요.(+, -, *, /중 하나 선택)");
                operator = reader.readLine();

                SendData sendObj = new SendData(num1, num2, operator);
                oos.writeObject(sendObj);
                oos.flush();

                String responseMsg = (String) ois.readObject();
                System.out.println("연산 결과 : " + responseMsg);
                System.out.println("계속 계산하기겠습니까?(yes/no 입력)");
                message = reader.readLine();
                if (message.equals("no"))
                    break;
                System.out.println("다시 계산합니다.");
            }
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
