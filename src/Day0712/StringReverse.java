package Day0712;

import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String[] init = "А роза упала на лапу Азора".split("");
        for (int i = 0; i < init.length/2; i++) {
            String tmp = init[i];
            init[i] = init[init.length - 1 - i];
            init[init.length - 1 - i] = tmp;
        }
        String res = Arrays.toString(init);
        System.out.println(res);
    }
}
