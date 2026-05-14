package com.alex.curso.java.aula05.exerciciosAula24;

public class MainLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.marca = "Branca";
        lampada.modelo = "Redonda";
        lampada.valor = 45.56;

        System.out.println("Marca da lampada: " + lampada.marca);
        System.out.println("Modelo da lampada: " + lampada.modelo);
        System.out.println("Valor da lampada: " + lampada.valor);
    }
}
