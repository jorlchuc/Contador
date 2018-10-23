/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorgui.model;

/**
 *
 * @author JorgeLuis
 */
public class Contador {
    private int conteo;
    
    public Contador() {
        conteo = 0;
    }
    
    public void contar() {
        conteo++;
    }
    
    public void reiniciar() {
        conteo = 0;
    }
    
    public int getConteo() {
        return conteo;
    }
}
