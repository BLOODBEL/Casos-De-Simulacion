package org.example;

public class App {
    public static void main (String [] args ){
        Calculadora calc = new Calculadora () ;
        System.out.println(calc.sumar(1,2));
        System.out.println(calc.restar(1,2));
        System.out.println(calc.multiplicar(1,2));
        System.out.println(calc.dividir(1,2));
    }
}
