public class Chap18DoIt {

  public static void main(String[] args) {
    Chap18DoIt t = new Chap18DoIt();
  }
  public Chap18DoIt() {
    Runnable runner = new MyRunnable("First");
    Thread t = new Thread(runner);
    t.setPriority(Thread.MIN_PRIORITY);
    Runnable runner2 = new MyRunnable("Second");   // ①
    Thread t2 = new Thread(runner2);               // ②
    t2.setPriority(Thread.MAX_PRIORITY);           // ③

    System.out.println("main priority : " + Thread.currentThread().getPriority()
        + " (NORM_PRIORITY = " + Thread.NORM_PRIORITY + ")");
    System.out.println("First priority : " + t.getPriority()
        + " (MIN_PRIORITY = " + Thread.MIN_PRIORITY + ")");
    System.out.println("Second priority : " + t2.getPriority()
        + " (MAX_PRIORITY = " + Thread.MAX_PRIORITY + ")");

    t.start();
    t2.start();                                    // ④
  }
}
class MyRunnable implements Runnable {
  private static final int THREADS = 2;      // number of threads taking turns
  private static final Object lock = new Object();
  private static int turn = 0;               // whose turn it is: 0, 1, 0, 1, ...
  private static int created = 0;

  protected String name;
  private int id;                            // First = 0, Second = 1

  public MyRunnable(String tn) {
    name = tn;
    synchronized (lock) {
      id = created++;
    }
  }
  public void run() {
    for(int i=0;i<=10 ;i++) {
      synchronized (lock) {
        while (turn % THREADS != id) {
          try {
            lock.wait();
          } catch (InterruptedException e) {
            return;
          }
        }
        System.out.println(name+" :"+ i);
        turn++;
        lock.notifyAll();
      }
    }
  }
}
