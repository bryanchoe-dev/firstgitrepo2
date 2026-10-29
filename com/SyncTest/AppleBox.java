package com.SyncTest;

public class AppleBox {

  static private int apple = 10;
  private boolean available = false;

  public synchronized int get(int value) {
    while (available == false) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    available = false;
    if (apple - value < 0) {
      System.out.println("사과를 가져갈 수 없습니다. 현재 사과 : " + apple +
                         " 가지려는 수량: " + value);
      notify();
      return 0;
    }
    apple -= value;
    System.out.println("현재 사과 : " + apple);
    notify();
    return value;
  }

  // 이미지에 없어 추가: CatIn이 호출하는 save()
  public synchronized void save(int value) {
    while (available == true) {
      try {
        wait();
      } catch (InterruptedException e) {
      }
    }
    apple += value;
    System.out.println("현재 사과 : " + apple);
    available = true;
    notify();
  }
}
