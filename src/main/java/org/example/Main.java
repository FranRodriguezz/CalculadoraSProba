package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(resultado(10, 40.07, reader));
    }

    public static double resultado(int cantidad, double promedio, BufferedReader reader) throws IOException {
        double res = 0;
        for(int i = 0; i < cantidad; i++){
            double aux = Float.parseFloat(reader.readLine());
            System.out.println(aux-promedio);
            res += Math.pow(aux - promedio, 2);
        }
        return res/(cantidad - 1);
    }
}