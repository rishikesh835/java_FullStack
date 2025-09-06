
public class Demo {
    public static void main(String[] args) {
        System.out.println("1D array");
        int num[] = { 1, 2, 3, 4, 5 };
        int num1[] = new int[5];

        num[0] = 8;
        num1[1] = 9;
        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }
        System.out.println("2D array");
        int[][] multiNum = new int[3][4];

        for (int i = 0; i < multiNum.length; i++) {
            for (int j = 0; j < multiNum[i].length; j++) {
                multiNum[i][j] = i + j;
                System.out.print(multiNum[i][j] + " ");
            }
            System.out.println();
        }
        for (int n[] : multiNum) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("jagged array/ ragged array / irregular array");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[4];

        for (int n[] : jaggedArray) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("3d array");
        int[][][] threeDArray = new int[2][3][4];
        for (int n[][] : threeDArray) {
            for (int m[] : n) {
                for (int o : m) {
                    System.out.print(o + " ");
                }
                System.out.println();
            }
        }
    }
}
