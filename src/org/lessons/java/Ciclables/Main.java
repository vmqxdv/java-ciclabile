package org.lessons.java.Ciclables;

public class Main {
  public static void main(String[] args) {

    IntegersList integers = new IntegersList();

    // -- Empty Constructor
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

    // -- Contructor with array
    IntegersList integersFromArray = new IntegersList(new int[] { 1, 5, 8, 7, 3, 2 });

    System.out.printf("%s\nTerzo while loop:\n", "-".repeat(15));

    while (integersFromArray.hasNextElement()) {
      System.out.println(integersFromArray.getNextElement());
    }
  }
}
