package com.song.designer.No1_单例模式.singleton;

/**
 * lazy loading
 * 懒汉式
 * 加锁，效率问题
 */
public class Mgr05 {
  private static Mgr05 INSTANCE;

  private Mgr05() {
  }

  public static Mgr05 getInstance() {
    if (INSTANCE == null) {
      //通过同步代码块，提高效率，不可行
      synchronized (Mgr05.class) {
        try {
          Thread.sleep(1);
        } catch (InterruptedException e) {
          e.fillInStackTrace();
        }
        INSTANCE = new Mgr05();
      }
    }
    return INSTANCE;
  }

  public void m() {
    System.out.println("m");
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      new Thread(() -> {
        System.out.println(Mgr05.getInstance().hashCode());
      }).start();
    }
  }
}
