/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promocasa;

import java.util.ArrayList;

/**
 *
 * @author julian
 */
public class PromoCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Contador =0;
        ArrayList<MoldeCasa> Fraccionamiento = new ArrayList<MoldeCasa>();
      
        MoldeCasa casa1= new MoldeCasa();
        Fraccionamiento.add(casa1);
        
        System.out.println(Fraccionamiento.size());
               
        Fraccionamiento.get(Contador).agregar(Contador+1);
        Fraccionamiento.get(Contador).imprimir();
    }
    
}
