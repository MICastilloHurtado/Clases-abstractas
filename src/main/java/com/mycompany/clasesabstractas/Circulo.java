
package com.mycompany.clasesabstractas;

public class Circulo extends Figura {
    
    private double radio;

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }    
    
}
