package com.song.designer.No1_单例模式.singleton;

/**
 * lazy loading
 * 懒汉式
 * j加锁，效率问题
 */
public class Mgr04 {
  private static Mgr04 INSTANCE;

  private Mgr04() {
  }

  public static synchronized Mgr04 getInstance() {
    if (INSTANCE == null) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.fillInStackTrace();
      }
      INSTANCE = new Mgr04();
    }
    return INSTANCE;
  }

  public void m() {
    System.out.println("m");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr04.getInstance().hashCode());
      }).start();
    }
  }
}
