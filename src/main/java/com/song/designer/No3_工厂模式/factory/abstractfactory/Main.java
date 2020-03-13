package com.song.designer.No3_工厂模式.factory.abstractfactory;

import com.song.designer.No3_工厂模式.factory.factorymethod.Car;

/**
 * @author AJohn
 */
public class Main {
  public static void main(String[] args) {
    Car c = new Car();
    c.go();
    AK47 w = new AK47();
    w.shoot();
    Bread b = new Bread();
    b.printName();

    ///
    AbstractFactory f = new MagicFactory();
    Vehicle v = f.createVehicle();
    v.go();
    Food bb = f.createFood();
    bb.printName();
    Weapon ww = f.createWeapon();
    ww.shoot();
  }

}
