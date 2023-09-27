package org.example;

import java.util.Scanner;

public class Main3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("========== FOLHA DE PAGAMENTO ==========");

        System.out.println("Digite o salário do colaborador: R$ ");
        double salario = Double.parseDouble(sc.nextLine());

        System.out.println("Digite o nome completo do colaborador: ");
        String nome = sc.nextLine();

        System.out.println("Digite o tempo de casa do colaborador (em anos): ");
        int tCasa = sc.nextInt();

//        Calculando a alíquota de INSS

        double aliquota_1 = 0.11;
        double aliquota_2 = 0.09;
        double aliquota_3 = 0.08;
        double inss = 0;
        int pInss = 0;

        if (salario >= 2000){
            pInss = 11;
            inss = salario * aliquota_1;
        } else if (salario < 2000 && salario > 1500) {
            pInss = 9;
            inss = salario * aliquota_2;
        } else {
            pInss = 8;
            inss = salario * aliquota_3;
        }

//        Calculando a alíquota de Vale Transporte

        double vt = 0;
        int pVt = 0;

        if (salario >= 1800) {
            pVt = 6;
            vt = salario * 0.06;
        } else if (salario < 1800 && salario > 1200) {
            pVt = 4;
            vt = salario * 0.04;
        } else {
            pVt = 0;
            vt = 0;
        }

//        Calculando a alíquota de Bonificação

        double bonificacao = 0;

        if (tCasa >= 10) {
            bonificacao = salario * 0.05;
        } else if (tCasa <= 9 && tCasa >= 5) {
            bonificacao = salario * 0.02;
        } else {
            bonificacao = 0;
        }

        double salario_liquido = salario - inss - vt + bonificacao;

        System.out.println("\n========== CONTRACHEQUE ==========");

        System.out.println("=========================================================================");
        System.out.println("| Salário: R$ " + salario + "                                                    |");
        System.out.println("| Tempo de casa: " + tCasa + " anos                                                |");
        System.out.println("| Desconto de INSS: " + pInss + "% - R$ " + inss + "                                      |");
        System.out.println("| Desconto VT: " + pVt + "% - R$ " + vt + "                                             |");
        System.out.println("| Bonificação: " + tCasa + " anos - R$ " + bonificacao + "                                      |");
        System.out.println("|                                                                       |");
        System.out.println("| Salário Líquido: R$ " + salario_liquido + "                                            |");
        System.out.println("=========================================================================");
    }
}
