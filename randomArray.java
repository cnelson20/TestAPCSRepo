import java.util.Random;

public class randomArray {
  public static void main(String[] args) {
      System.out.println(arrToString(create2DArray(10,10,99)) + "\n");

      System.out.println(arrToString(create2DArrayRandomized(10,10,99)));
  }

  public static String arrToString(int[][] arr) {
    String str = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i != 0) {str += "\n";}
      str += "{";
      for (int j = 0; j < arr[i].length; j++) {
        if (j != 0) {str += ", ";}
        str += arr[i][j];
      }
      str += "}";
    }
    return str + "}";
  }
  public static String arrToString(int[] arr){
    String str = "{";

    for (int i = 0; i < arr.length; i++) {
      if (i != 0) {str += ", ";}
      str += arr[i];
    }

    return str + "}";
  }

  public static int[][] create2DArray (int rows, int cols, int maxVal) {
    Random rnd = new Random();
    int[][] arr1 = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        arr1[i][j] = rnd.nextInt(maxVal + 1);
      }
    }
    return arr1;
  }

  public static int[][] create2DArrayRandomized (int rows, int cols, int maxVal) {
    Random rnd = new Random();
    int[][] arr1 = new int[rows][ ];
    for (int i = 0; i < rows; i++) {
      arr1[i] = new int[rnd.nextInt(cols + 1)];
      for (int j = 0; j < arr1[i].length; j++) {
        arr1[i][j] = rnd.nextInt(maxVal + 1);
      }
    }
    return arr1;
  }


}
