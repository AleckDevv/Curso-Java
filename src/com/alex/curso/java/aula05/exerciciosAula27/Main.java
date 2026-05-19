package com.alex.curso.java.aula05.exerciciosAula27;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.marca = "Duracel";
        lampada.tipoSoquete = "E27";
        lampada.modelo = "Redonda";
        lampada.potencia = 270.80;

        lampada.exibirCaracteristicas();

        lampada.ligarLampada();

        lampada.desligarLampada();
    }
}
