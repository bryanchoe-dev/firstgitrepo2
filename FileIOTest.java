import java.io.*;

public class FileIOTest {

  public static void main(String[] args) {
    File f = new File("FileIOTest.txt");

    try {
      writeTest(f);
      readTest(f);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void writeTest(File f) throws IOException {

    FileWriter fw = new FileWriter(f);
    fw.write("72:1의 법칙을 생각하자 \n");
    fw.write("하루에 한시간 인생설계를 하자");
    fw.close();

  }

  private static void readTest(File f) throws IOException {

    FileReader fr = new FileReader(f);
    int res = 0;

    while ((res = fr.read()) != -1) {
      System.out.print((char) res);
    }
    fr.close();

  }
}
