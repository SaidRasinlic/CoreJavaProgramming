package nizovi;

public class NewClass5 {

    public static void main(String[] args) {

        int width = 20, height = 10;

        int[][] points = {
            {2, 4}, //0 
            {1, 5}, //1
            {6, 6}, //2
            {3, 2}, //3
            {0, 0} //4
        };
        System.out.println(points.length);
        for (int i = 0; i < height; i++) {

            for (int j = 0; j < width; j++) {

                // 0, 5, 4, 2, 6
                int k = 0;
                for (; k < points.length; k++) {
                    if (i == points[k][0] && j == points[k][1]) 
                        break;
                    
                }

                if (k != points.length) {
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }

            }
            System.out.println("");
        }

    }
}
