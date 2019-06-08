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
public class Circulo extends Figura{
    private double r;
    public static double pi=3.141624;
    
    Circulo(Double r){
        super("Circulo","azul");
        this.r=r;
    }
    public double area(){
        double resultado=0;
        resultado=this.r*pi;
        return resultado*resultado;
    }
    public double perimetro(){
        double resultado=0;
        resultado=this.r*pi;
        return resultado*2;
    }
}
