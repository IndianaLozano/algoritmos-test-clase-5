package com.redbee.clase5.ejercicios;

public class NumerosRomanos {

    public static Integer romanToDecimal(String roman) {
        int i;
        i = convertToDecimal(roman);
        return i;
    }

    private static <string> int convertToDecimal(String roman) {
        int decimal = 0;

        if(roman.length() == 1){

            switch(roman){

                case "I":
                    decimal = 1;
                    break;
                case "V":
                    decimal = 5;
                    break;
                case "X":
                    decimal = 10;
                    break;
                case "L":
                    decimal = 50;
                    break;
                case "C":
                    decimal = 100;
                    break;
                case "D":
                    decimal = 500;
                    break;
                case "M":
                    decimal = 1000;
                    break;
                default:
                    break;
            }
        } else{
            // Divido a roman en array de strings de longitud 1
            String[] array = roman.split("");
            for(int j = 1; j < array.length; j++){
                Integer a = convertToDecimal(array[j - 1]);
                Integer b = convertToDecimal(array[j]);
                if(a >= b){
                    if(j == array.length - 1){
                        decimal += (a+b);
                    } else {
                        decimal += a;
                    }
                } else {
                    decimal += (b-a);
                }
            }
        }
        return decimal;
    }
}
