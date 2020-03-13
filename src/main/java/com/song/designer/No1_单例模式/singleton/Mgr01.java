package com.song.designer.No1_单例模式.singleton;

/**
 * 饿汉式
 * 类加载到内存时，就实例化一个单例，JVM保证线程安全
 * 私有构造方法，保证单例
 * 缺点：不管用到与否，类加载时就完成实例化
 */
public class Mgr01 {
  private static final Mgr01 INSTANCE = new Mgr01();

  private Mgr01() {
  }

  private static Mgr01 getInstance() {
    return INSTANCE;
  }

  private void m() {
    System.out.println("m");
  }

  public static void main(String[] args) {
    Mgr01 m1 = Mgr01.getInstance();
    Mgr01 m2 = Mgr01.getInstance();
    System.out.println(m1 == m2);
  }
}
