package com.song.designer.No3_工厂模式.factory.abstractfactory;

/**
 * @author AJohn
 */
public class ModernFactory extends AbstractFactory {
  @Override
  Food createFood() {
    return new Bread();
  }

  @Override
  Vehicle createVehicle() {
    return new Car();
  }

  @Override
  Weapon createWeapon() {
    return new AK47();
  }
}
