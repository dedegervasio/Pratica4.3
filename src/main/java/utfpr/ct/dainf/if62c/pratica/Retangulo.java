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
public class Retangulo implements FiguraComLados {
    double ladoMenor;
    double ladoMaior;
    
    public Retangulo(double lado_1,double lado_2){
        if(lado_1>lado_2){
            this.ladoMaior = lado_1;
            this.ladoMenor = lado_2;
        }
        else{
            this.ladoMaior = lado_2;
            this.ladoMenor = lado_1;
        }
    }
    
    @Override
    public double getLadoMaior(){
        return ladoMaior;
    }
    
    @Override
    public double getLadoMenor(){
        return ladoMenor;
    }
    
    @Override
    public double getArea(){
        return ladoMaior*ladoMenor;
    }
    
    @Override
    public double getPerimetro(){
        return (2*ladoMaior) + (2*ladoMenor);
    }
    
    @Override
    public String getNome(){
        return this.getClass().getSimpleName();
    }
    
}
