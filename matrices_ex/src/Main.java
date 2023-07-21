import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] mat = new int[row][column];

        System.out.println("Input numbers into the matrix:");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("What number are you looking for?");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println(mat[i][j] + " is in position " + i + ", " + j);
                    if (j > 0){
                        System.out.println("Number in the left: " + mat[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Number above: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1){
                        System.out.println("Number in the right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Number below: " + mat[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
