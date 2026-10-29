class MyThread implements Runnable
{
  int i;

  public void run() {
    while(i < 10) {
      i++;
      System.out.println(Thread.currentThread().getName()+" i : "+i);
    }
  }
}

public class ThreadTest1
{
  public static void main(String args[]) throws Exception {
    Thread t1 = new Thread(new MyThread());
    Thread t2 = new Thread(new MyThread());
    t1.start();
    t2.start();
  }
}
