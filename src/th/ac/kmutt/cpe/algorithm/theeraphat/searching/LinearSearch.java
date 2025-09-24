package th.ac.kmutt.cpe.algorithm.theeraphat.searching;

import java.util.ArrayList;

public class LinearSearch<T extends Comparable<T>> implements SearchStrategy<T> {
  public int search(ArrayList<T> list, T target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).compareTo(target) == 0) {
        return i;
      }
    }
    return -1;
  }
}
