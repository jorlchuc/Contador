/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorgui;

import contadorgui.model.Contador;

/**
 *
 * @author JorgeLuis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println("Conteo: " + c.getConteo());
        c.contar();
        c.contar();
        c.contar();
        System.out.println("Conteo: " + c.getConteo());
        c.reiniciar();
        System.out.println("Conteo: " + c.getConteo());
        c.contar();
        c.contar();
        System.out.println("Conteo: " + c.getConteo());
    }
    
}
