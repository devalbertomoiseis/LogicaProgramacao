package VariaveisConstantes;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do Produto");
        Double valorProduto = scanner.nextDouble();

        System.out.println("Digite a quantidade passada pelo cliente !");
        Double valorPassadoPeloCliente = scanner.nextDouble();

        Double resultado = valorPassadoPeloCliente - valorProduto;
        System.out.println("Valor : " + resultado);

        scanner.close();
    }
}
