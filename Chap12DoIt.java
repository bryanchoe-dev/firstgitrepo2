public class Chap12DoIt {
  public static void prn() throws Exception {
    throw new Exception();
  }
  public static void main(String[] args) {
    try {
      prn();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
