import java.util.Scanner;
public class Main {
    public static int getArr(int arr[], int index) {
        return arr[index];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // array defined manually
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

          System.out.print("Enter value of index (0-9): ");
          System.out.println("Invalid index enter value between 0-" +(arr.length-1));
          int index = scan.nextInt();
          try {
              // We write the line of code that may cause an error in try.
              int result = getArr(arr, index);  // called method
              System.out.println("Index element: "+result);
          }
          catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("Error: Invalid index, enter between 0-" +(arr.length-1));
          }
    }
}