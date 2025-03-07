import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Test code here
    String[] test = {"forest", "apple", "willow", "lake", "tree"};
    sortAndPrintDescending(test);
    System.out.println("");
    ArrayList<Integer> skibidi = new ArrayList<Integer>();
    skibidi.add(4);
    skibidi.add(6);
    skibidi.add(3);
    skibidi.add(7);
    selectSortDescending(skibidi);
  }


  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void sortAndPrintDescending(String[] arr)
  {
    System.out.println("Implement me!");
    int i, min, j;
    for (i = 0; i < arr.length - 1; i++){
      min = i;
      for (j = i + 1; j < arr.length; j++){
        if (arr[j].compareTo(arr[min]) > 0){
          min = j;
        }
      }
        String temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
    for (String word : arr){
      System.out.println(word);
    }
  }

  /** Precondition: No element of arr is null.
   * Precondition: arr is non-empty
   */
  public static void selectSortDescending(ArrayList<Integer> list)
  {
    System.out.println("Implement me!");
    int i, j, max;
    for (i = 0; i < list.size() - 1; i++){
      max = i;
      for (j = i + 1; j < list.size(); j++){
        if (list.get(j) > list.get(max)){
          max = j;
        }
      }

      int temp = list.get(max);
      list.set(max, list.get(i));
      list.set(i, temp);
      
    }
    System.out.println(list);
  }
}
