package com.redbee.clase5.ejercicios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Crea una calculadora que sea capaz de recibir una operación matemática como input en un string y devuelva el
 * resultado de la misma. Para simplificar la implementación de la solución asumamos que la cadena ya está validada
 *
 * Requerimiento 1
 * Cuando el string esté vacío, deberá devolver 0. Por ejemplo, cuando se llame a calcular("") deberá devolver 0
 *
 * Requerimiento 2
 * Deberá manejar null. Si es llamado calcular(null) deberá devolver 0
 *
 * Requerimiento 3
 * Deberá manejar la posibilidad que introduzcan 1 solo valor. Por ejemplo si se llama a calcular("3"), entonces deberá
 * devolver el mismo valor, en este caso 3
 *
 * Requerimiento 4
 * Cuando se llame una operación de suma, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("1+3") entonces deberá devolver 4
 *
 * Requerimiento 5
 * Cuando se llame a una operación de resta, deberá interpretarla y realizar la operación necesaria. Por ejemplo si se
 * llama a calcular("5-6") deberá devolver 1
 *
 */
@DisplayName("Laboratorio para ejercicio de calculadora")
public class CalculadoraDeStringsLab {

    @Test
    @DisplayName("Test calculadora de strings - suma")
    public void testCalculadoraDeStringsConSuma(){

        //give: cocinar los datos
        final var operationAsString = "";
        final var expectedResult = 0;

        //when: testeo el requerimiento
        final var actualResult = CalculadoraStrings.calcular("");

        //then: analizar el resultado
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test calculadora de strings - imput.length() == 1")
    public void testCalculadoraDeStringsConLongitud1(){

        //give: cocinar los datos
        final var operationAsString = "2";
        final var expectedResult = 2;

        //when: testeo el requerimiento
        final var actualResult = CalculadoraStrings.calcular(operationAsString);

        //then: analizar el resultado
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test calculadora de strings - resta")
    public void testCalculadoraDeStringsConResta(){

        //give: cocinar los datos
        final var operationAsString = "2-1";
        final var expectedResult = 1;

        //when: testeo el requerimiento
        final var actualResult = CalculadoraStrings.calcular(operationAsString);

        //then: analizar el resultado
        assertEquals(expectedResult, actualResult);
    }



}
