import java.io.*;
public class FileStream {
  public static void main(String[] args) {
    try {
      Output();
      Input();
    } catch (Exception e) {
      System.out.println(e.toString());
    }
  }
  private static void Input() throws IOException {
    FileInputStream fis = new FileInputStream("data.txt");
    int i;
    while ((i = fis.read()) != -1) {
      System.out.print((char) i);
    }
    fis.close();
  }
  private static void Output() throws IOException {
    FileOutputStream fos = new FileOutputStream("data.txt");
    for (int i = 97; i <= 122; i++) {
      fos.write(i);
    }
    fos.close();
  }
}
