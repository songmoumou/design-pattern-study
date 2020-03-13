package com.song.designer.No3_工厂模式.factory.factorymethod;

/**
 * @author AJohn
 */
public class Main {
  public static void main(String[] args) {
    Car c = new Car();
    c.go();
    Plane p=new Plane();
    p.go();

    Moveable m=new Plane();
    m.go();
    Moveable moveable=new CarFactory().create();
    moveable.go();
  }

}
