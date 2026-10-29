package com.SyncTest;

public class CatIn extends Thread {
  private AppleBox applebox;
  private String name;

  public CatIn(AppleBox a, String name) {
    applebox = a;
    this.name = name;
  }
  public void run() {
    for (int i = 0; i < 5; i++) {
      applebox.save(1);
      System.out.println("++++" + this.name + ", 담을 수량 : 1");
    }
  }
}
