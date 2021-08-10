package com.redbee.clase5.ejercicios;

import java.util.Objects;

public class CalculadoraStrings {

    public static Integer calcular(String operation) {
        int result = 0;

        //operation is null or empty
        if (Objects.equals("", operation) || Objects.equals(operation, null)) {
            return result;
        } else if (operation.length() == 1){
            return Integer.parseInt(operation);
        } else {
            String[] operadores = operation.split("[0-9]+");
            String[] numeros = operation.split("[+-]");
            result = Integer.parseInt(numeros[0]);
            int i = 1;
            while(numeros.length > i){
                if(operadores[i].equals("+")){
                    result += Integer.parseInt(numeros[i]);
                } else if (operadores[i].equals("-")){
                    result -= Integer.parseInt(numeros[i]);
                }
                i++;
            }
            return result;
        }
    }
}
