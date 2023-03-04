package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Double> list = new ArrayList<>();
        System.out.println("Ingrese cantidad de la muestra: ");
        int cantidad = Integer.parseInt(reader.readLine());
        System.out.println("El valor de S es: " + resultado(cantidad, list, reader));
    }

    public static double resultado(int cantidad, List<Double> list, BufferedReader reader) throws IOException {
        double prom;
        double res = 0;
        System.out.println("Ingrese valores (presione enter despues de cada uno): ");
        for(int i = 0; i < cantidad; i++){
            double aux = Float.parseFloat(reader.readLine());
            list.add(aux);
        }
        prom = promedio(list);
        for (Double aDouble : list) {
            res += Math.pow(aDouble - prom, 2);
        }
        return Math.sqrt(res/(cantidad - 1));
    }


    public static double promedio(List<Double> list){
        return list.stream()
                .mapToDouble(a -> a)
                .average().orElse(0);
    }
}