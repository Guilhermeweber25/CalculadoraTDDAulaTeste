package com.epar.sistema;

import com.epar.sistema.service.Numero;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumeroTest {

   @ParameterizedTest
    @CsvSource({
            "1 , false",
            "2 , true",
            "0 , true"
    })
    void TestarNumero(int numero, boolean resultado) {
        assertEquals(resultado, Numero.numeroPar(numero));
    }
}
