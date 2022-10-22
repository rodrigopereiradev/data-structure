package br.com.rodrigo.arrays;

public class RunningMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();

        }

        System.out.println();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


    }


}
