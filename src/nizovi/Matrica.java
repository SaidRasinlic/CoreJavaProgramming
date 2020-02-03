package nizovi;

public class Matrica {

    public static void main(String[] args) {

        int[][] A = {
            {2, 4, 5},
            {1, 3, 7},
            {6, 2, 8}
        };

        int[][] B = {
            {1, 3, 1},
            {8, 9, 4},
            {5, 3, 2}

        };

        int[][] C = new int[3][3];

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + "  ");

            }
            System.out.println("");

        }

    }

}
/*


        System.out.print("Zbir matrica glasi:\n");
        for (int i = 0; i < mat1.length; ++i) {
            for (int j = 0; j < mat1[i].length; ++j)
                System.out.printf("%-4d", mat1[i][j] + mat2[i][j]);

            System.out.println();
        }

 */
