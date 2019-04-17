/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocasa;

import java.util.Scanner;
/**
 *
 * @author julian
 */

public class MoldeCasa {
    private int clave;
    public int pisos;
    public String nombre;
    public String no_exterior;
    public int manzana;
    public int lote;
    public int modelo;
    public double banios;
    private Scanner sc = new Scanner(System.in);
    
    public MoldeCasa(){
        clave=0;
        pisos=0;
        nombre="";
    }
    public void agregar(int id){
        System.out.println("Proporcione cuantos pisos:");        
        pisos=sc.nextInt();
        sc.nextLine();
        System.out.println("Proporcione nombre de la casa:");
        nombre=sc.nextLine();
        
        
        clave=id;
        System.out.println("Registro creado satisfactoriamente.");
    }
    public void imprimir(){
        System.out.println("Casa modelo "+modelo+" clave: "+clave);
        System.out.println("Descripcion: "+nombre);
        System.out.println("Pisos: "+pisos);
        
    }
    public void editar(){
        
    }    
    
}
