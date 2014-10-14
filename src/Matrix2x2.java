import java.util.Scanner;

public class Matrix2x2 {

    // Field
    private int n = 2; // For easy to change matrix size in future
    private int member[][] = new int[n][n];

    // Method
    // Input All Member in Matrix
    public void inputAllMember() {
        Scanner sn = new Scanner(System.in);
        System.out.println("<< Input Matrix Member >>");
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                member[i][j] = sn.nextInt();
            }
        }
    }

    // Add two Matrix
    public static Matrix2x2 add(Matrix2x2 a, Matrix2x2 b) {
        Matrix2x2 res = new Matrix2x2();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                res.member[i][j] = a.member[i][j] + b.member[i][j];
            }
        }
        return res;
    }

    // Subtract two Matrix
    public static Matrix2x2 subtract(Matrix2x2 a, Matrix2x2 b) {
        Matrix2x2 res = new Matrix2x2();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                res.member[i][j] = a.member[i][j] - b.member[i][j];
            }
        }
        return res;
    }

    // Multiply two Matrix
    public static Matrix2x2 multiply(Matrix2x2 a, Matrix2x2 b) {
        Matrix2x2 res = new Matrix2x2();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                for (int k = 0; k < a.n; k++) {
                    res.member[i][j] += a.member[i][k] * b.member[k][j];
                }
            }
        }
        return res;
    }

    // Print out Matrix
    @Override
    public String toString() {
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                System.out.print(member[i][j] + " ");
            }
            System.out.println("");
        }
        return "";
    }
    
    public String printM(int i, int j){
        System.out.print(member[i][j]+" ");
        return "";
    }
}
