package com.song.designer.No2_策略模式.strategy;

/**
 * jdk 1.8以后，增加FunctionalInterface，如果接口只有一个函数默认可以不加注解，并且接口可以有默认实现
 * 实现Comparator来指定策略模式
 */
@FunctionalInterface
public interface Comparator<T> {
  int compare(T t1, T t2);

  default void m() {
    System.out.println("m");
  }
}
