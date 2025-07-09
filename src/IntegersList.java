public class IntegersList {

  private int[] integers;
  private int index;

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
}
