package nizovi;

public class JavaProgramNumberHundred {

    public static void main(String[] args) {

        /*  int[][] multiArray = new int[2][3];
        multiArray[0][1] = 24;
        multiArray[1][2] = 100;

        int[][] dvoDim = {
            {2, 5, 8},
            {1, 4, 3}
        };

        int[][][] troDim = {
            {
                {541, 257, 773}, {100, 5, 6, 7}
            }
        };

        int multi[][] = new int[3][];
        multi[0] = new int[3];
        multi[1] = new int[3];
        multi[2] = new int[3]; 
        
              int[][] multiArray = new int[3][2];
        multiArray[1][1] = 24;
        multiArray[2][0] = 100;

        
        
        System.out.println(multiArray [2][0]);
        
        
        
        
        
         */
        String[][] players = {
            {"1", "Peter", "Jackson", "150.51"},
            {"2", "Sally", "Jones", "232.12"},
            {"3", "Said", "Rasynl", "100.99"}

        };

        System.out.println("id\tname\tsurname\tbalance");
        for (String [] player : players) {
            System.out.print(player[0] + "\t");
            System.out.print(player[1] + "\t");
            System.out.print(player[2] + "\t");
            System.out.print(player[3] + "\n");
        }

    }

}
