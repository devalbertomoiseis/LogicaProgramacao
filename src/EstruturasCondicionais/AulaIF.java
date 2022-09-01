package EstruturasCondicionais;

import java.util.Scanner;

public class AulaIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma Nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite uma Nota: ");
        Double nota2 = scanner.nextDouble();
        System.out.println("Digite uma Nota: ");
        Double nota3 = scanner.nextDouble();
        System.out.println("Digite uma Nota: ");
        Double nota4 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4)/4;
        if(media >= 7.0){
            System.out.println("Aluno aprovado com media: " + media);
        }else{
            System.out.println("Aluno recuperacao com media: " + media);
        }
    }
}
