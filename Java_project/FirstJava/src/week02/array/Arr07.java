package week02.week02.array;

public class Arr07 {
    public static void main(String[] args) {
        int[][] array = new int[3][];

        array[0] = new int[2];
        array[1] = new int[4];
        array[2] = new int[1];

        int[][] array2 = {
                {10,20},
                {10,20,30,40},
                {10}
        };

        System.out.println(array[0][1]);
    }
}
