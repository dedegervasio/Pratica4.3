/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author a1614193
 */
public class Quadrado extends Retangulo {
    
    public Quadrado(double lado){
        super(lado,lado);
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }
}
