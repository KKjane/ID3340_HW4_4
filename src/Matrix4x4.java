public class Matrix4x4 {

    // Field
    private int n = 2;
    private Matrix2x2[][] member = new Matrix2x2[2][2];
    private int amember[][] = new int[4][4]; // For Method toString

    // Constructor
    Matrix4x4() {
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                member[i][j] = new Matrix2x2();
            }
        }
    }

    // Method
    // Input Each 2*2 Matrix in 4*4 Matrix
    public void inputAllMember() {
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                member[i][j].inputAllMember();
            }
        }
    }

    // Add two 4*4 Matrix
    public static Matrix4x4 add(Matrix4x4 a, Matrix4x4 b) {
        Matrix4x4 res = new Matrix4x4();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                res.member[i][j] = Matrix2x2.add(a.member[i][j], b.member[i][j]);
            }
        }
        return res;
    }

    // Subtract two 4*4 Matrix
    public static Matrix4x4 subtract(Matrix4x4 a, Matrix4x4 b) {
        Matrix4x4 res = new Matrix4x4();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                res.member[i][j] = Matrix2x2.subtract(a.member[i][j], b.member[i][j]);
            }
        }
        return res;
    }

    // Multiply two 4*4 Matrix
    public static Matrix4x4 multiply(Matrix4x4 a, Matrix4x4 b) {
        Matrix4x4 res = new Matrix4x4();
        for (int i = 0; i < a.n; i++) {
            for (int j = 0; j < a.n; j++) {
                for (int k = 0; k < a.n; k++) {
                    res.member[i][j] = Matrix2x2.add(res.member[i][j], Matrix2x2.multiply(a.member[i][k], b.member[k][j]));
                }
            }
        }
        return res;
    }

    // Print out 4*4 Matrix
    @Override
    public String toString() {
        for (int i = 0; i < member.length; i++) {
            for (int j = 0; j < member.length; j++) {
                for (int k = 0; k < member.length; k++) {
                    for(int l = 0; l < member.length; l++){
                        System.out.print(member[i][k].printM(j, l)+" ");
                    }
                }
                System.out.println("");
            }
        }
        return "";
    }
}
