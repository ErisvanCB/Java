package org.example;

//import java.util.Scanner;

public class Main2 {
    public static void main (String [] args){

//        String nome = "Erisvan";
//        String sobrenome = "";
//        int idade = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite o seu sobrenome: ");
//        sobrenome = sc.nextLine();
//
//        System.out.println("Digite a dua idade: ");
//        idade = sc.nextInt();
//
//        System.out.println("Olá. O seu nome e sobrenome são: " + nome + " " + sobrenome + " e você tem " + idade + " anos.");

//        for (int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }

//        int numero = 0;
//        while (numero <=10 ){
//            System.out.println(numero);
//            numero++;
//        }



//        Usando o "for" e o "while"

        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            } else {
                System.out.println(" ");
            }
        }

        System.out.println("\n======================================================");

        int nImpar = 0;
        while (nImpar <= 100){
            if (nImpar % 2 != 0){
                System.out.println(nImpar);
            } else {
               System.out.println(" ");
            }

            nImpar++;
        }
    }
}
