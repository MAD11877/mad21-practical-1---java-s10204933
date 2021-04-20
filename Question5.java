import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int elem = in.nextInt();
    int arr[] = new int[elem];
    int mode = 1;

    for (int i=0; i < elem; ++i) {
      arr[i] = in.nextInt();
    }

    for (int i=0; i < elem; ++i) {
      if (arr[i] == '\0') i++;  // dont count for those alr accounted
      int occur = 1;
      for (int j=i+1; j < elem; ++j) {
        if (arr[i] == arr[j]) {
          occur++;      
          arr[j] = '\0';        // set accounted for to null
        }
      }
      if (occur > mode) mode = arr[i];
    }

    System.out.println(mode);

    in.close();
  }
}
