package org.lessons.java.Ciclables;

public class Main {
  public static void main(String[] args) {

    IntegersList integers = new IntegersList();

    System.out.printf("%s\nPrimo while loop:\n", "-".repeat(15));

    while (integers.hasNextElement()) {
      System.out.println(integers.getNextElement());
    }

    integers.addElement(5);
    integers.addElement(3);
    integers.addElement(1);
    integers.addElement(7);
    integers.addElement(9);
    integers.addElement(0);

    System.out.printf("%s\nSecondo while loop:\n", "-".repeat(15));

    while (integers.hasNextElement()) {
      System.out.println(integers.getNextElement());
    }
  }
}
