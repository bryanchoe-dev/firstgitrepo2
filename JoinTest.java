class JoinTest extends Thread{
  private int first,last;
  public int sum;

  public JoinTest(int first,int last){
    this.first=first;
    this.last=last;
  }

  public void run(){
    for(int i=first;i<=last;i++){
      sum = sum + i;
      System.out.println("Current Thread: "+currentThread().getName());
    }
  }

  public static void main(String[] args) throws InterruptedException{

    JoinTest thread1=new JoinTest(1,5);
    JoinTest thread2=new JoinTest(6,10);

    thread1.start();
    thread2.start();

    thread1.join();


    System.out.println("Thread1 sum : "+thread1.sum);
    System.out.println("Thread2 sum : "+thread2.sum);
    System.out.println("Total sum : "+(thread1.sum+thread2.sum));
  }
}
