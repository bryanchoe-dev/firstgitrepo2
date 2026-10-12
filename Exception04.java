import java.util.*;

class YourOwn extends Exception {
  private static final long serialVersionUID = 1L;

  @Override
  public String toString() {
    return "음수입니다.";
  }
}

public class Exception04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 0;
    try {
      a = sc.nextInt();
      if (a < 0)
        throw new YourOwn();
      System.out.println(a);
    } catch (YourOwn m) {
      System.out.println(m.toString());
    } catch (InputMismatchException e) {
      System.out.println("정수를 입력하세요.");
    } catch (Exception e) {
      System.out.println(e);
    } finally {
      sc.close();
    }
  }
}
