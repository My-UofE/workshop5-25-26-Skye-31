import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp{
  public static void main(String[] args) {
    int nVals = args.length;
    int[] myVals = new int[nVals];
    for (int i = 0; i < nVals; i++) {
        int item = Integer.parseInt(args[i]);
        myVals[i] = item;
    }
    System.out.println("original values: " + Arrays.toString(myVals));

    ArrayList<Integer> uniqueVals = new ArrayList<>();
    for (Integer i : myVals) {
        if(!uniqueVals.contains(i)) {
            uniqueVals.add(i);
        }
    }
    System.out.println("unique values: " + Arrays.toString(uniqueVals));
  }
}