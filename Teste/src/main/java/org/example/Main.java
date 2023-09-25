package org.example;

public class Main {
    public static void main(String[] args) {

        String nome = "Erisvan";

        System.out.println("Hello and welcome!");

        if (nome != "Erisvan"){

            System.out.println("O nome " + nome + " não é o seu nome!");

        } else {

            for (int i = 1; i <= 10; i++) {

                System.out.println("Olá " + nome + ". Essa é a vez de número " + i + " que o programa passa por aqui.");

            }
        }
    }
}