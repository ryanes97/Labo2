/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo_2;

/**
 *
 * @author ryane
 */
public class Proveedor {
    private String name;
    private String producto;
    
    public String getname(){
        return name;
    }
    public String getproducto(){
        return producto;
    }
    
    public void setname(String nombre){
        this.name = nombre;
    }
    public void setproducto(String p){
        this.producto = p;
    }
}
