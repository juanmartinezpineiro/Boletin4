/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author jmartinezpineiro
 */
public class Almacen {
    //Establecer las variables privadas
    private int patacas;
    private int polbo;
    private int clientes;
     //Establecer constructor por defecto
    public Almacen (){
        
    }
    //Constructor con parametros
    public Almacen (int polbo, int patacas){
        this.polbo = polbo;
        this.patacas = patacas;
        
    }
    
    //Metodos
    
    public int podeSuministrar(){
        int usarPolbo;
        usarPolbo=polbo/2;
        clientes = Math.min(usarPolbo,patacas);
        return clientes;
    }
    
    public void engadirPolbo(int polbo){
        this.polbo=polbo+this.polbo;
    }
    public void engadirPatacas (int patacas){
        this.patacas=patacas+this.patacas;
    }
    
    public void amosarPolbo(){
       System.out.println("Cantidad de polbo que tengo: "+polbo);
    }
    
    public void amosarPatacas(){
        System.out.println("Cantidad de patacas que tengo: "+patacas);
    }
}
