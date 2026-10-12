public class Exception01 {
  public static void main(String[] args) {
    int i = 0;
    int b = 100;
    int res = 0;

    try {
      res = b / i;
    } catch (ArithmeticException e) {
      System.out.println("예외 발생: " + e.getMessage());
    } finally {
      System.out.println("finally 블록 실행");
    }

    System.out.println("res="+res);
  }
}
