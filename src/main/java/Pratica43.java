/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;
/**
 *
 * @author a1614193
 */
public class Pratica43 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(4);
        Elipse elipse = new Elipse(2, 5);
        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(2,4);
        TrianguloEquilatero trianguloequilatero = new TrianguloEquilatero(2);

        System.out.println("Area elipse: " + elipse.getArea() + " Perimetro elipse: " + elipse.getPerimetro());
        System.out.println("Area circulo: " + circulo.getArea() + " Perimetro circulo: " + circulo.getPerimetro());
        System.out.println("Area quadrado: " + quadrado.getArea() + " Perimetro quadrado: " + quadrado.getPerimetro());
        System.out.println("Area retangulo: " + retangulo.getArea() + " Perimetro retangulo: " + retangulo.getPerimetro());
        System.out.println("Area triangulo equilatero: " + trianguloequilatero.getArea() + " Perimetro triangulo equilatero: " + trianguloequilatero.getPerimetro());
    }

}
