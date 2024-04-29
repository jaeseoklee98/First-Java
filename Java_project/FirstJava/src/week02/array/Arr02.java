package week02.week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d"};

        for(int i=0;i<intArr.length;i++) {
            intArr[i] = i;
        }

        System.out.println("---------------");

//        for(int i=0;i<intArr.length;i++) {
//            System.out.println(intArr[i]);
//        }
//        for (int item: intArr) {
//            System.out.println(item);
//        }

        Arrays.fill(intArr, 1);

        for (int item: intArr) {
            System.out.println(item);
        }

    }
}
