/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras_geometricas;

/**
 *
 * @author julia
 */
public class Figuras_geometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo c1=new Circulo(12.5);
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
    }
    
}
