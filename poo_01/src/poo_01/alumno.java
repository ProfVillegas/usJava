/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_01;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class alumno {
    public int edad;
    private String nombre;
    public String ap_paterno;
    public String ap_materno;
    
    public alumno(){
       edad=0;
       nombre="";
       ap_paterno="";
       ap_materno="";
    }
    public void capturar(){
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Proporcione edad: ");
        edad=sc.nextInt();
        sc.nextLine();
        System.out.println("Proporcione nombre: ");
        nombre=sc.nextLine();
        System.out.println("Proporcione apellido paterno: ");
        ap_paterno=sc.nextLine();
        System.out.println("Proporcione apellido materno");
        ap_materno=sc.nextLine();
    }
    
}
