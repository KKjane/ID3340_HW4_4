/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author wLongjaroen
 */
public class TestMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix4x4 m1 = new Matrix4x4();
        Matrix4x4 m2 = new Matrix4x4();
        
        m1.inputAllMember();
        m2.inputAllMember();
        
        System.out.println("Sum");
        System.out.println(Matrix4x4.add(m1, m2));
        System.out.println("Sub");
        System.out.println(Matrix4x4.subtract(m1, m2));
        System.out.println("Product");
        System.out.println(Matrix4x4.multiply(m1, m2));
    }
    
}
