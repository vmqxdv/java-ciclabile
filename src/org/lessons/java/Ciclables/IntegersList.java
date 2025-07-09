package org.lessons.java.Ciclables;

public class IntegersList {

  private int[] integers;
  private int index;

  public IntegersList() {
    this.integers = new int[0];
  }

  public IntegersList(int[] arr) {
    this.integers = arr;
  }

  public int getNextElement() {
    return integers[index++];
  }

  public boolean hasNextElement() {
    return index < integers.length;
  }

  public void addElement(int num) {
    int[] newIntegers = new int[this.integers.length + 1];

    for (int i = 0; i < this.integers.length; i++) {
      newIntegers[i] = this.integers[i];
    }

    newIntegers[newIntegers.length - 1] = num;

    this.integers = newIntegers;
  }
}
