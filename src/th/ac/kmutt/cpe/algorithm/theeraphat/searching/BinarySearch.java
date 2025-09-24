package th.ac.kmutt.cpe.algorithm.theeraphat.searching;

public class BinarySearch<T extends Comparable<T>> implements SearchStrategy<T> {
  public int search(java.util.ArrayList<T> list, T target) {
    int left = 0;
    int right = list.size() - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (list.get(mid).compareTo(target) == 0) {
        return mid;
      } else if (list.get(mid).compareTo(target) < 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
