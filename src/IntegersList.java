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
    int nextElementIndex = index > 0 ? index++ : 0;
    return integers[nextElementIndex];
  }

  public boolean hasNextElement() {
    return index + 1 < integers.length;
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
