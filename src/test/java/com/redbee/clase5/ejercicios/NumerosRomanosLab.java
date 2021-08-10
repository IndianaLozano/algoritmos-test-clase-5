package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Escribe una función que traduzca de números romanos a decimales romanToDecimal(roman). En aras de mantener el kata
 * simple, asumamos que ya vienen validados los números.
 *
 * Los números romanos, del sistema de numeración de la antigua Roma usaba combinaciones de letras del alfabeto latino
 * para representar valores. Consta de siete símbolos:
 *
 * | Símbolo | Valor |
 * | I       | 1     |
 * | V       | 5     |
 * | X       | 10    |
 * | L       | 50    |
 * | C       | 100   |
 * | D       | 500   |
 * | M       | 1000  |
 *
 * Ejemplos:
 *
 * MMVI = 1000 + 1000 + 5 + 1 = 2006
 * MCMXLIV = 1000 + (1000 - 100) + (50 - 10) + (5 - 1) = 1944
 */
@DisplayName("Laboratorio para ejercicio de numeros romanos")
public class NumerosRomanosLab {

    @Test
    @DisplayName("Prueba para numero romano I = 1")
    void TestIRomano(){
        //give: datos
        final var roman = "I";
        final var esperado = 1;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano V = 5")
    void TestVRomano(){
        //give: datos
        final var roman = "V";
        final var esperado = 5;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano X = 10")
    void TestXRomano(){
        //give: datos
        final var roman = "X";
        final var esperado = 10;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano XX = 20")
    void TestXXRomano(){
        //give: datos
        final var roman = "XX";
        final var esperado = 20;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano IX = 9")
    void TestIXRomano(){
        //give: datos
        final var roman = "IX";
        final var esperado = 9;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano LXX = 70")
    void TestLXXRomano(){
        //give: datos
        final var roman = "LXX";
        final var esperado = 70;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }

    @Test
    @DisplayName("Prueba para numero romano MDLXI = 1561")
    void TestMDLXIRomano(){
        //give: datos
        final var roman = "MDLXI";
        final var esperado = 1561;

        //when: testeo del requerimiento
        final var romanActual = NumerosRomanos.romanToDecimal(roman);

        //then: analizar resultados
        Assertions.assertEquals(esperado, romanActual);
    }
}
