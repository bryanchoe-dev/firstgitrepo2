public class MyException extends Exception {
  MyException(String reason) {
    super(reason);
  }

  public static void main(String[] args) {
    try {
      throw new MyException("try MyException!!");
    } catch (MyException me) {
      System.out.println(me);
    } finally {
      System.out.println("Finally====!");
    }
  }
}
