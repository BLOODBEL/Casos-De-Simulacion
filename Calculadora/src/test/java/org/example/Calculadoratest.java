package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Calculadoratest {
    @Test
    public void probarSuma(){
        double resultado = 15.0 ;
         Calculadora calc = new Calculadora();
        Assert.assertEquals(15.0,calc.sumar(6,9) , 0.001);

    }
    @Test
    public void probarRestar(){
        double resultado = 5.0 ;
        Calculadora calc = new Calculadora();
        Assert.assertEquals(5.0,calc.restar(15,5) , 0.001);

    }
    @Test
    public void probarMiltiplicar(){
        double resultado = 15.0 ;
        Calculadora calc = new Calculadora();
        Assert.assertEquals(15.0,calc.multiplicar(3,5) , 0.001);

    }
    @Test
    public void probarDividir(){
        double resultado = 15.0 ;
        Calculadora calc = new Calculadora();
        Assert.assertEquals(15.0,calc.dividir(30,2) , 0.001);

    }
}