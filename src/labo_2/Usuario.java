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
public class Usuario {
    private String name;
    private String contra;
    
    public String getname(){
        return name;
    }
    public String getcontra(){
        return contra;
    }
    
    public void setname(String n){
        this.name = n;
    }
    public void setcontra(String c){
        this.contra = c;
    }
}