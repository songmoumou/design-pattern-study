package com.song.designer.No3_工厂模式.factory.abstractfactory;

/**
 * @author AJohn
 */
public class MagicFactory extends AbstractFactory {
  @Override
  Food createFood() {
    return new Meat();
  }

  @Override
  Vehicle createVehicle() {
    return new Plane();
  }

  @Override
  Weapon createWeapon() {
    return new AWM();
  }
}
