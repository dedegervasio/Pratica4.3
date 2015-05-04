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
public class TrianguloEquilatero extends Retangulo {
    
    public TrianguloEquilatero(double lado){
        super(lado,lado * Math.sqrt(3) / 2);
    }
    
    @Override
    public double getPerimetro(){
        return ladoMaior*3;
    }
    
    @Override
    public double getArea(){
        return ladoMaior*ladoMenor/2;
    }
    
    @Override
    public double getLadoMenor(){
        return ladoMaior;
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }
    
}
