//Shayan Chowdhury
//APCS1 pd2
//HW02 -- Step 1: Split, Step 2: ?, Step 3: Sorted!
//2018-02-07

/*======================================
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
    Method merge takes two sorted arrays and merges 
    them onto each other to form one complete final 
    merged array.

    Runtime Best Case: O(n)
    Runtime Worst Case: O(nlogn)
  ======================================*/

public class MergeSort {
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge(int[] a, int[] b) {
    int[] fin = new int[a.length + b.length]; //final sorted array to be returned

    a = sort(a);
    b = sort(b);

    int i = 0, j = 0, k = 0;
    while (i < a.length && j < b.length) //originally had a nested for loop, but this seems to work just as well
    {
      if (a[i] < b[j]) {
        answer[k] = a[i++];
      } else {
        answer[k] = b[j++];
      }

      k++;
    }

    while (i < a.length) {
      answer[k++] = a[i++];
    }

    while (j < b.length) {
      answer[k++] = b[j++];
    }

  }//end merge()

  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort(int[] arr) {
    int passes = 0;
    while (passes <= data.size() - 1) { //base case using passes
      for (int i = passes; i > 0; i--) { //since there are two partitions now, we want to start from the last item of the first (sorted) partition
        if (data.get(i).compareTo(data.get(i - 1)) < 0) { //compare the last item of the sorted partition with the one before it. If lower then...
          Comparable temp = data.get(i - 1); //create a temp variable to be swapped
          data.set(i - 1, data.get(i)); //AND...
          data.set(i, temp); //SWAP
        }
      }
      passes++; //increment passes by 1 for each pass to fulfill while loop conditional
    }
  }//end sort()

  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess(int[] a) {
    for (int i = 0; i < a.length; i++)
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray(int[] a) {
    System.out.print("[");
    for (int i : a)
      System.out.print(i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------

  //main method for testing
  public static void main(String[] args) {

      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
    
      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
    
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
    
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );
    
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
