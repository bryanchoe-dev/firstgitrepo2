import java.io.*;

public class BufferedByteStreams {
  public static void main(String args[]) {
    try {
      FileInputStream input = new FileInputStream("data.txt");
      BufferedInputStream bufInput = new BufferedInputStream(input, 3072);
      FileOutputStream output = new FileOutputStream("res.txt");
      BufferedOutputStream bufOutput = new BufferedOutputStream(output,
          3072);
      byte[] buffer = new byte[128];

      int readChar = bufInput.read(buffer);

      while (readChar != -1) {
        bufOutput.write(buffer, 0, readChar);
        readChar = bufInput.read(buffer);
      }

      bufInput.close();
      bufOutput.close();

    } catch (FileNotFoundException ex) {
      System.out.println("파일을 찾을수 없습니다.");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
