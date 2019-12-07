package Day0712;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {5, 8, 6, 1, 3, 2, 9, 4};
        System.out.println(Arrays.toString(data));
        for (int barrier = data.length - 1; barrier >= 0; barrier--) {
            for (int index = 0; index < barrier; index++) {
                if (data[index] > data[index + 1]) {
                    int tmp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));

    }
}
