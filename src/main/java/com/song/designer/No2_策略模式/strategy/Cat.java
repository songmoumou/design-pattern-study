package com.song.designer.No2_策略模式.strategy;

/**
 * @author AJohn
 */
public class Cat implements Comparable<Cat>{
  int weight, height;

  public Cat(int weight, int height) {
    this.weight = weight;
    this.height = height;
  }


  @Override
  public String toString() {
    return "Cat{" +
        "weight=" + weight +
        ", height=" + height +
        '}';
  }

  @Override
  public int compareTo(Cat c) {
    //Cat c=(Cat)o;
    if (this.weight < c.weight) return -1;
    else if (this.weight < c.weight) return 1;
    else return 0;

  }
}
