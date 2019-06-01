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
public class Figura {
    protected String nombre;
    protected String color;
    
    Figura(String n,String c){
        this.color=c;
        this.nombre=n;
    }
    public void setNombre(String value){
        this.nombre=value;
    }
    public void setColor(String value){
        this.color=value;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getColor(){
        return this.color;
    }
}
