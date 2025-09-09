package com.example.calculator.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Calculator {
    public Double sum(Double number1, Double number2) {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }
        return number1 - number2;
    }

    public Double divide (Double number1, Double number2)  {
        if(number1 == null || number2 == null){
            throw new NullPointerException("Número 1 e número 2 são obrigatórios.");
        }else if(number1 == 0 || number2 == 0){
            throw new ArithmeticException("Divisão por zero não é permitido.");
        }
        return number1 / number2;
    }

    public Integer factorial(Integer factorial) {
        if(factorial == null){
            throw new NullPointerException("Número é obrigatório.");
        }
        int start = 1;
        for(int i = 2; i <= factorial; i++){
            start *= i;
        }
        return start;
    }

    public Integer integerToBinary(Integer integer) {
        int[] binary = new int[35];
        int i = 0;
        while(integer > 0){
            binary[i++] = integer % 2;
            integer = integer /2;
        }
        int result = 0;
        for(int d : binary){
            result += d * 10;
        }
        return result;
    }

    // Exemplos:
    // Integer = 1 -> Hexadecimal = "1"
    // Integer = 5 -> Hexadecimal = "37"
    // Integer = 170 -> Binary = "AA"
    public String integerToHexadecimal(Integer integer) {
        String result = String.format("%X", integer);
        return result;
    }

    // Exemplos
    // Date 1 = LocalDate.of(2020, 3, 15);
    // Date 2 = LocalDate.of(2020, 3, 29)
    // Total de dias = 14
    public int calculeDayBetweenDate(LocalDate date1, LocalDate date2) {
       return (int) ChronoUnit.DAYS.between(date1, date2);
    }

}
