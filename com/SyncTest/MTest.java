package com.SyncTest;


public class MTest {
  public static void main(String[] args) {
    AppleBox a = new AppleBox();
    CatIn cat = new CatIn(a, "야옹이");
    PuppyOut puppy = new PuppyOut(a, "멍멍이");
    cat.start();
    puppy.start();
  }
}
