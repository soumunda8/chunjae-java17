package sec2;

public class Example2 {
    public static void main(String[] args) {

        int[] intArr1 = {10, 20, 30};
        int[][] intArr2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}, {20, 40, 60}};
        int[][][] intArr3 = {{{10, 20}, {30, 40}, {50, 60}}, {{10, 20}, {30, 40}, {50, 60}}};

        System.out.println(intArr2.length);

        for (int i = 0; i < intArr2.length; i++) {          // 줄
            for(int j = 0; j < intArr2[0].length; j++) {    // 칸
                System.out.print(intArr2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("=========================");

        for (int i = 0; i < intArr3.length; i++) {                  // 면
            for(int j = 0; j < intArr3[0].length; j++) {            // 줄
                for(int k = 0; k < intArr3[0][0].length; k++) {     // 칸
                    System.out.print(intArr3[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("--------------");
        }

    }
}