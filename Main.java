//Write the following method that returns the location of the largest element in a two-dimensional array a:
//public static Location locateLargest(double[][] a)
//The return value is an instance of Location.
//Write a class named Location. The class contains three public data fields row (int), column (int), and maxValue (double). maxValue stores the maximal value in the two-dimensional array.
// row and column are the row and column indices for maxValue in the array.
//Write a main method that prompts the user to enter a two-dimensional array and displays the location of the largest element in the array.
//  If there is more than one largest element, return the smallest row index and then the smallest column index.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] a = new double[rows][columns];
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble(); 
            }
        }

        Location loc = locateLargest(a);
        System.out.println("The location of the largest element is " + loc.maxValue +
                           " at (" + loc.row + ", " + loc.column + ")");
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
class Location {
    public int row;
    public int column;
    public double maxValue;
}