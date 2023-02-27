import java.sql.SQLOutput;

public class twoDimensionArray {
    public static void main(String[] args) {
        //create 2D array
        //int [][] grades; // initialise 2d array
        int[][] grades = {{80, 95, 70}, {65, 100, 80}};
        //grades = new int [2][3]; //specify the size, null

        //grades [0][0] = 50;
        //grades [0][1] = 55;
        //grades [0][2] = 90;

        // grades [1][0] = 70;
        // grades [1][1] = 80;
        // grades [1][2] = 75;

        //grades [0] [1] = 65; //updating value from 50 to 65

        for (int i = 0; i < grades.length; i++) { //to access row
            for (int j = 0; j < grades[i].length; j++) { //to access column
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        String[][] names = {{"Harry", "Potter", "Ron", "Weasley", "Elaine", "Weasley"}, {"Hillary", "Potter", "Rose", "Weasley", "Elsie", "Weasley"}};
        for (int i = 0; i < names.length; i++) { //to access row
            for (int j = 0; j < names[i].length; j++) { //to access column
                System.out.print(names[i][j] + " ");
            }
            System.out.println();
        }
    }
}