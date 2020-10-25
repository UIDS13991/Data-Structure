package DS_Chapter1 ;

import java.util.Scanner;

public class Soal5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int numberOfMatrices = in.nextInt();
        for (int i = 0; i<numberOfMatrices; i++){
            String status = "Tame";
            int rows = in.nextInt();
            int columns = in.nextInt();
            int[][] matrix = new int[rows][columns];
            for (int r = 0; r<rows; r++){
                int[] row = new int[columns];
                for (int c = 0; c<columns; c++){
                    row[c] = in.nextInt();
                    matrix[r][c] = row[c];
                }
                if (!isTame(row)){
                    status = "Wicked";
                    break;
                }
            }
            if (status != "Wicked"){
                for (int c = 0; c<columns; c++){
                    int[] column = new int[rows];
                    for (int r = 0; r<rows; r++){
                        column[r] = matrix[r][c];
                    }
                    if (!isTame(column)){
                        status = "Wicked";
                        break;
                    }
                }
                System.out.println(status);
            } else {
                System.out.println(status);
            }
        }

    }

    public static boolean isTame(int... arr){
        boolean b = true;
        int n = arr.length;
        int [] khosh = new int[n-1];
        for (int i = 0; i < n-1; i++)
            khosh[i] = Math.abs(arr[i] - arr[i+1]);
        for (int i = 0; i < n-2; i++) {
            if(Math.abs(khosh[i] - khosh[i+1]) != 1)
                b = false;
        }
        return b;
    }
}