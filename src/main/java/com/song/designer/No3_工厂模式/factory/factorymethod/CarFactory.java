package com.song.designer.No3_工厂模式.factory.factorymethod;

/**
 * @author AJohn
 */
public class CarFactory {
  public Car create(){
    //before processing
    System.out.println("Car 已创建");
    return new Car();
  }
}
