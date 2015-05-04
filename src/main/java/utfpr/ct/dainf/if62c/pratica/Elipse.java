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
public class Elipse implements FiguraComEixos {

    protected double semiEixoX;
    protected double semiEixoY;

    public Elipse(double semiEixoX, double semiEixoY) //Construtor
    {
        this.semiEixoX = semiEixoX;
        this.semiEixoY = semiEixoY;
    }

    @Override
    public double getEixoMenor() {
        if (semiEixoX > semiEixoY) {
            return semiEixoY * 2;
        } else {
            return semiEixoX * 2;
        }
    }

    @Override
    public double getEixoMaior() {
        if (semiEixoX > semiEixoY) {
            return semiEixoX * 2;
        } else {
            return semiEixoY * 2;
        }
    }

    @Override
    public double getArea() {
        return (Math.PI * semiEixoX * semiEixoY);
    }

    @Override
    public double getPerimetro() {
        return Math.PI * (3 * (semiEixoX + semiEixoY) - Math.sqrt((3 * semiEixoX + semiEixoY) * (semiEixoX + semiEixoY * 3)));
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName();
    }
}
