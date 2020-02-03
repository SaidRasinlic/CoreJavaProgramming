package nizovi;

public class Xoxo {

    public static void main(String[] args) {

    /*    int width = 20;
        int height = 10;

        int[][] points = {{2, 4}, {1, 5}, {6, 6}, {3, 2}, {0, 0}};

        System.out.println(points.length);

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                //0,1,2,3,4
                int k = 0;
                for (; k < points.length; k++) {
                    if (i == points[k][0] && j == points[k][1]) // 4,0 i 4,1
                    
                        break;
                }

                if (k != points.length) {
                    System.out.print("X" + k);
                } else {
                    System.out.print("O" );
                }

            }
            System.out.println();

        } */
        int width = 20;
        int height = 10;
        int[][] points = {{2, 4}, {1, 5}, {6, 6}, {3, 2}, {0, 0}};
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int k = 0;
                for (; k < points.length; k++)
                    if (i == points[k][0] && j == points[k][1])
                        break;

                if (k != points.length)
                    System.out.print("X" );
                else
                    System.out.print("O");
            }
            System.out.println();
        }
    }

}
/*
    int width = 20;
        int height = 10;
        int[][] points = {{2, 4}, {1, 5}, {6, 6}, {3, 2}, {0, 0}};
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int k = 0;
                for (; k < points.length; k++)
                    if (i == points[k][0] && j == points[k][1])
                        break;

                if (k != points.length)
                    System.out.print("X");
                else
                    System.out.print("O");
            }
            System.out.println();
        }
 */
