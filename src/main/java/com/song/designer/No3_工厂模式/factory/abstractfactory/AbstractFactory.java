package com.song.designer.No3_工厂模式.factory.abstractfactory;

/**
 * @author AJohn
 */
public abstract class AbstractFactory {
  abstract Food createFood();
  abstract Vehicle createVehicle();
  abstract Weapon createWeapon();

}
