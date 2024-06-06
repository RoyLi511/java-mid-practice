import java.util.ArrayList;

public class mySort {

    public static void switchCase() {
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > arrs[i+1]) {
                int temp = arrs[i+1];
                arrs[i+1] =  arrs[i];
                arrs[i] = temp;
            }
        }
    }

    public static int[] mySort(int[] arrs) {
        ArrayList<Integer> array = new ArrayList<>();


        return array;
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 34, 4, 6, 677, 12, 45, 15, 21, 1234, 612, 778, 303, 132, 245, 677};
        mySort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
