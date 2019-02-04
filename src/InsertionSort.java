import java.util.Arrays;

/**
 * Created by dp-ptcstd-26 on 04.02.2019.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] ints = {5,7,1,3,2,0};

        sort(ints);
    }

    public static void sort(int[] ints) {


        for (int i = 1; i < ints.length; i++) {
            for (int j = 0; j < i-1; j++) {
                if (ints[i] < ints[j]) {
                    int a = ints[i];

                }
            }
        }
        System.out.println(Arrays.toString(ints));

    }
}
