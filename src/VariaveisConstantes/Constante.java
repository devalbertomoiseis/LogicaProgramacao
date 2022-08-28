package VariaveisConstantes;

import java.util.Scanner;

public class Constante {
    static  final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
    public static void main(String[] args) {

        /* Constante "final" não pode ter seu valor alterado*/
        final Integer idadeMinimaParaTirarCarteira = 18;
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Idade: ");
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteira = idade >= idadeMinimaParaTirarCarteira;

        if(podeTirarCarteira){
            System.out.println("Sim !Ele(a) pode tirar a carteira ?" + podeTirarCarteira);
        }else{
            System.out.println("Não! Ele(a) não pode tirar a carteira" + podeTirarCarteira);
        }
    }
}
