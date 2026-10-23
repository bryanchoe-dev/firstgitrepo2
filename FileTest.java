import java.io.*;
public class FileTest {
  public static void main(String[] args) {
    File file = new File(".", "FileExam.txt");
    System.out.println("getPath() : " + file.getPath());
    System.out.println("toString() : " + file.toString());
    System.out.println("getName() : " + file.getName());
    System.out.println("getParent() : " + file.getParent());
    System.out.println("isAbsolute() : " + file.isAbsolute());
    System.out.println("exists() : " + file.exists());
    System.out.println("isFile() : " + file.isFile());
    System.out.println("isdirectory() : " + file.isDirectory());
    System.out.println("canRead() : " + file.canRead());
    System.out.println("canWrite() : " + file.canWrite());
    System.out.println("length() : " + file.length());
    System.out.println("lastModified() : " + file.lastModified());
  }
}
