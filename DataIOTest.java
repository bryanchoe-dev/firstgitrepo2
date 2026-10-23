import java.io.*;
public class DataIOTest {
  public static void main(String[] args) throws IOException {
    FileOutputStream fos = new FileOutputStream("DataIo.txt");
    DataOutputStream dos = new DataOutputStream(fos);
    dos.writeInt(1234);
    dos.writeDouble(123.456);
    dos.writeUTF("hello");
    FileInputStream fis = new FileInputStream("DataIo.txt");
    DataInputStream dis = new DataInputStream(fis);
    System.out.println(dis.readInt());
    System.out.println(dis.readDouble());
    System.out.println(dis.readUTF());
    dos.close();
    dis.close();
  }
}
