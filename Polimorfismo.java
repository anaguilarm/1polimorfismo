/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Nohemi Aguilar
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cerdo cerdo= new Cerdo("rosadito", "omnivoro",9);
        
        Vaca vaca = new Vaca("pinta","hervivoro",5);
        
         cerdo.alimentacion();
         cerdo.correr();
         vaca.alimentacion();
         vaca.correr();
    }
      
}
