package com.generation;

public class Main {

    public static void main(String[] args) {
        String nombre = "Alfonso cruz";

        //Datos primitivos numericos
        byte num1 = 10;
        short num2 = 10;
        int num3 =10;
        long num4 = 10;

        //declaracion del dato tipo float debe contener una (f) y para doble (d) al final para que lo reconozca
        float decimal = 10.55f;
        double decimal2 = 20.0000000d;

        //Dato promitivo char
        char caracter = 'r';

        //Dato primitivo boolean
        boolean verdadero = true;

        //convertir datos de forma byte<short>int>
        short numshort = num1;
        int numint = numshort;
        short numshort2 = (short) numint;

        byte numByte1 = 120;
        byte numByte2 =120;
        //short suma = (short) (numByte1 + numByte2);

        //System.out.println(nombre);
        //System.out.println(suma);
        //System.out.println(numint);
        //System.out.println(numshort2);

        int val1 = 15;
        int val2 = 30;

        int suma = val1 + val2;
        int Resta = val1 - val2;
        int Mult = val1 * val2;
        int Div = val2 / val1;
        System.out.println(suma);
        System.out.println(Resta);
        System.out.println(Mult);
        System.out.println(Div);
        boolean x = true;
        boolean Y = false;
        boolean z = true;
        boolean dato = (x && y) || (x && z);
        System.out.println(dato)

    }
}
