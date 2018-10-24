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
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Almacen obxAlmacen1 = new Almacen ();
       obxAlmacen1.engadirPolbo(10);
       obxAlmacen1.engadirPatacas(10);
       System.out.println(obxAlmacen1.amosarPolbo());
    }
    
}
