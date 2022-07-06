//Linear Search
//ICS4U1, Dip Tandel
//Jan 11, 2022

public class LinearSearch {

  public static void main(String[] args) {
    //creates an array from index 0 to 8 (length: 9)
    int[] arr = { 32, 1, 543, 763, 23, 43, 4, 12, 1 };
    //passes array through search method, looking for index of number "1"
    System.out.println("Index (-1 = not available): " + LinearSearch(arr, 1));
  }

  //Linear search method accepts an array and a "target" value (1, in this case)
  public static int LinearSearch(int[] arr, int target) {
    //Sifts through each index of the array and checks if it is the "target" value
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        //Method returns the index which "target" value is at (if its found)
        return i;
      }
    }
    //If the "target" value is not in the array, a negative number is returned to show its not there
    return -1;
  }
}
