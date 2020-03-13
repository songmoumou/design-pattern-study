package com.song.designer.No3_工厂模式.factory.factorymethod;

/**
 * 简单工厂可扩展性不好
 */
public class SimpleVehicleFactory {
  public Car createCar(){
    //before processing
    return new Car();
  }
  public Plane createPlane(){
    return new Plane();
  }
}
