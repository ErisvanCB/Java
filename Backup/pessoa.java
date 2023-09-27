public class pessoa {

    static String pele;
    static String orgaos;
    static String cabeca;
    static String pes;
    static String maos;
    static String bracos;
    static String boca;

    static int idade;

    static float porcentagem;

    public static void falar(){
        // System.out.println ("Falando");
        boca = "Falando!";
    }
    public static void andar(){
        pes = "Andando!";
    }
    public static void escrever(){
        maos = "Escrevendo!";
    }
    
    public static void comer(){
        System.out.println ("Comendo");
    }
    public static void dormir(){
        System.out.println ("Dormindo");
    }
}