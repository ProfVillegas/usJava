/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo3;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Arreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner sc = new Scanner(System.in);
        
        int[] edad= new int[5];
        String[] nombre = new String[5];
        String[] ap_paterno= new String[5];
        String[] ap_materno= new String[5];
        
        for(int x=0; x<5;x++){
            System.out.println("Proporcione edad: ");
            edad[x]=sc.nextInt();
            sc.nextLine();
            System.out.println("Proporcione nombre: ");
            nombre[x]=sc.nextLine();
            System.out.println("Proporcione apellido paterno: ");
            ap_paterno[x]=sc.nextLine();
            System.out.println("Proporcione apellido materno: ");
            ap_materno[x]=sc.nextLine();
            sc.nextLine();
        }
        for(int x=0; x<5;x++){
            System.out.println(edad[x]);
            System.out.println(nombre[x]);
            System.out.println(ap_paterno[x]);
            System.out.println(ap_materno[x]);
        }
    }
    
}
