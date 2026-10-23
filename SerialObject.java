import java.io.*;

public class SerialObject implements Serializable {
  private String name; // 이름
  transient private String dept; // 부서
  private static String title; // 직책

  @SuppressWarnings("static-access")
  public SerialObject(String name, String dept, String title) {
    this.name = name;
    this.dept = dept;
    this.title = title;
  }

  public String toString() {
    return name + ":" + dept + ":" + title;
  }
}
