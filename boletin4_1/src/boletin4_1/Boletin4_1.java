/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_1;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Coche coche1 = new Coche();
         coche1.acelerar(60);
         System.out.println(""+coche1.getVelocidad());
         coche1.frenar(30);
         System.out.println(""+coche1.getVelocidad());
    }
   
        
}
