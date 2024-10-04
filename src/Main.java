//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int[] even = getEvenDigits(arr);
        System.out.println();
        System.out.println(even);
    }

    public static int[] getEvenDigits(int[] values) {
        int s = 0;
        int j = 0;
        int[] even = new int[values.length];

        for(int i = 0; i < values.length; ++i) {
            if (values[i] % 2 == 0) {
                even[j] = values[i++];
                ++j;
                even[s] = j++;
                ++s;
            }
        }

        Arrays.sort(even, 4, 8);
        return Arrays.copyOf(even, s);
    }
}
