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
public class Producto {
    private String name;
    private int precio;
    private int cantidad;
    private String estado;
    
    public Producto(){
}
    
    public String getname(){
        return name;
    }
    
    public int getprecio(){
        return precio;
    }
    
    public int getcantidad(){
        return cantidad;
    }
    
    public String getestado(){
        return estado;
    }
    
    public void setname(String n){
        this.name = n;
    }
    
    public void setprecio(int p){
        this.precio = p;
    }
    
    public void setcantidad(int c){
        this.cantidad = c;
    }
    
    public void setestado(String e){
        this.estado = e;
    }
}


