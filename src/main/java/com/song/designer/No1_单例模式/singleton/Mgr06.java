package com.song.designer.No1_单例模式.singleton;

/**
 * lazy loading
 * 懒汉式
 * 加锁，效率问题
 * DCL double check lock 双重检查
 * 防止指令重排，加volatile
 */
public class Mgr06 {
  private static volatile Mgr06 INSTANCE;

  private Mgr06() {
  }

  public static Mgr06 getInstance() {
    if (INSTANCE == null) {
      //双重检查
      synchronized (Mgr06.class) {
        if (INSTANCE == null) {
          try {
            Thread.sleep(1);
          } catch (InterruptedException e) {
            e.fillInStackTrace();
          }
          INSTANCE = new Mgr06();
        }
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
        System.out.println(Mgr06.getInstance().hashCode());
      }).start();
    }
  }
}
