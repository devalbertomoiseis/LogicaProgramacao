package VariaveisConstantes;

import java.util.Scanner;

public class Introducao00 {
    public static void main(String[] args) {
        String nomeCompleto = "Alberto Moiseis";
        System.out.println("Olá, "+ nomeCompleto);
        String programa = "Santander Coders";
        System.out.println(programa);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor ");
        int valor = scanner.nextInt();
        if( valor % 2  == 0){
            System.out.println("O valor é par: " + valor);
        } else{
            System.out.println("O valor é impar: " + valor);
        }


    }
}
