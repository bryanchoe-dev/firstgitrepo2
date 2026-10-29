public class Chap18DoIt {

  public static void main(String[] args) {
    Chap18DoIt t = new Chap18DoIt();
  }
  public Chap18DoIt() {
    Runnable runner = new MyRunnable("First");
    Thread t = new Thread(runner);
    t.setPriority(Thread.MIN_PRIORITY);
    t.start();
    Runnable runner2 = new MyRunnable("Second");   // ①
    Thread t2 = new Thread(runner2);               // ②
    t2.setPriority(Thread.MAX_PRIORITY);           // ③
    t2.start();                                    // ④
  }
}
class MyRunnable implements Runnable {
  protected String name;
  public MyRunnable(String tn) {
    name = tn;
  }
  public void run() {
    for(int i=0;i<=10 ;i++) {
      System.out.println(name+" : "+ i);
    }
  }
}
