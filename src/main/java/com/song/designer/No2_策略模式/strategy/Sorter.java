package com.song.designer.No2_策略模式.strategy;

/**
 * @author AJohn
 */
public class Sorter<T>{

  //第一步
  public  void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        minPos = arr[j] < arr[minPos] ? j : minPos;
      }
      swap(arr, i, minPos);
    }

  }

  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  //第er步
  public  void sort(Cat[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        minPos = arr[j] .compareTo( arr[minPos])==-1 ? j : minPos;
      }
      swap(arr, i, minPos);
    }

  }
   void swap(Cat[] arr, int i, int j) {
    Cat temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  //第三步
  public  void sort(Comparable[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        minPos = arr[j] .compareTo( arr[minPos])==-1 ? j : minPos;
      }
      swap(arr, i, minPos);
    }

  }
  void swap(Comparable[] arr, int i, int j) {
    Comparable temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  //第四步
  public  void sort(T[] arr,Comparator<T> comparator) {
    for (int i = 0; i < arr.length - 1; i++) {
      int minPos = i;
      for (int j = i + 1; j < arr.length; j++) {
        minPos = comparator.compare(arr[j],arr[minPos])==-1 ? j : minPos;
      }
      swap(arr, i, minPos);
    }

  }
  void swap(T[] arr, int i, int j) {
    T temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
