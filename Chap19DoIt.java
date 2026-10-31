import java.net.InetAddress;
import java.net.UnknownHostException;

public class Chap19DoIt {

    public static void main(String[] args) {

        try {
            InetAddress me = InetAddress.getLocalHost();
            String addr = me.getHostAddress();
            System.out.println("My address is " + addr);
        } catch (UnknownHostException e) {
            System.out.println(e.toString());
        }

    }
}
