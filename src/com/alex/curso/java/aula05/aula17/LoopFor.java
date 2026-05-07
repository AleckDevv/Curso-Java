package com.alex.curso.java.aula05.aula17;

import java.util.Scanner;

public class LoopFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            System.out.println("Excutou: " + i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = " + i + " j = " + j);
        }

        scan.close();
    }
}
