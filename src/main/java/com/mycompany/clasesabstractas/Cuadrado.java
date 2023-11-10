
package com.mycompany.clasesabstractas;

public class Cuadrado extends Figura {
    
    double lado;

    @Override
    public double calcularArea() {
    double resultado = lado * lado;
    return resultado;    
    }
    
    
    
}
