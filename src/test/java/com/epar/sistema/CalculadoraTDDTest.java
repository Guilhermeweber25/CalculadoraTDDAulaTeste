package com.epar.sistema;

import com.epar.sistema.service.CalculadoraTDD;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTDDTest {

    // RED: teste criado antes da implementação
    @Test
    void DeveSomarNumeros() {
        CalculadoraTDD calculadora = new CalculadoraTDD();

        int resultado = calculadora.somar(2, 3);

        assertEquals(5, resultado);
    }

    @Test
    void DeveSubtrairNumeros(){
        CalculadoraTDD calculadora = new CalculadoraTDD();

        int resultado = calculadora.subtrair(10 , 5);

        assertEquals(5 , resultado);
    }

    @Test
    void DeveMultiplicarNumeros(){
        CalculadoraTDD calculadora = new CalculadoraTDD();

        int resultado = calculadora.multiplicar(5 , 5);

        assertEquals(25 , resultado);
    }


    @Test
    void DeveDividirNumeros(){
        CalculadoraTDD calculadora = new CalculadoraTDD();

        double resultado = calculadora.dividir(25 , 5);

        assertEquals(5 , resultado);
    }


}