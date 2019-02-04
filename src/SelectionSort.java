import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by dp-ptcstd-26 on 04.02.2019.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {5,7,1,3,2,0};

        sort(ints);
    }

    public static void sort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int min = ints[i];
            int min_idx = i;
            for (int j = i; j < ints.length; j++) {
                if (min > ints[j]) {
                    min = ints[j];
                    min_idx = j;
                }
            }
            if (!(min_idx == i))  {
                int a = ints[i];
                ints[i] = min;
                ints[min_idx] = a;
            }
        }
        for (int b:ints) {

            System.out.println(Arrays.toString(ints));
        }
    }

}
