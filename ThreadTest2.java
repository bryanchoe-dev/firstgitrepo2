class MyThread02 extends Thread
{
  int i;

  public void run() {
    while(i<10) {
      i++;
      System.out.println(Thread.currentThread().getName()  +"i : "+i);
    }
  }
}

public class ThreadTest2
{
  public static void main(String[] args)
  {
    MyThread02  t = new MyThread02();
    MyThread02  t1 = new MyThread02();
    t.start();
    t1.start();
  }
}
