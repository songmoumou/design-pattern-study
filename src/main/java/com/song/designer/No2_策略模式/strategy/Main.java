package com.song.designer.No2_策略模式.strategy;

import java.util.Arrays;

/**
 * @author AJohn
 */
public class Main {
  public static void main(String[] args) {
    //int[] a={9,2,3,5,7,1,4};
    Cat[] a={new Cat(3,3),new Cat(5,5),new Cat(1,1)};
    //Dog[] a={new Dog(3),new Dog(5),new Dog(1)};
    //Sorter sorter=new Sorter();
    Sorter<Cat> sorter=new Sorter<>();
    //sorter.sort(a,new DogComparator());
    //sorter.sort(a,new CatHeightComparator());
    sorter.sort(a,(o1,o2)->{
      if(o1.weight<o2.weight) return -1;
      else if(o1.weight>o2.weight) return 1;
      else return 0;
    });
    System.out.println(Arrays.toString(a));





  }
}
