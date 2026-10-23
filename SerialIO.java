import java.io.*;

public class SerialIO {

  public static void main(String args[]) {
    try {
      Output();
      Input();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  public static void Output() throws IOException {
    FileOutputStream fos = new FileOutputStream("object.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    SerialObject so1 = new SerialObject("홍길동", "총무부", "상무");
    SerialObject so2 = new SerialObject("정길동", "영업부", "부장");
    SerialObject so3 = new SerialObject("이길동", "인사부", "과장");
    oos.writeObject(so1);
    oos.writeObject(so2);
    oos.writeObject(so3);
    oos.close();
  }

  public static void Input() throws IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream("object.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);
    SerialObject rso1 = null;
    SerialObject rso2 = null;
    SerialObject rso3 = null;

    rso1 = (SerialObject) ois.readObject();
    rso2 = (SerialObject) ois.readObject();
    rso3 = (SerialObject) ois.readObject();

    System.out.println(rso1.toString());
    System.out.println(rso2.toString());
    System.out.println(rso3.toString());
    ois.close();
  }
}
