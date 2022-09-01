package Operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Integer adicao = 1 + 1;
        System.out.println("Adicao: ->" + adicao);

        Integer subtracao = 40 - 21;
        System.out.println("Subtracao: ->" + subtracao);

        Integer multiplicacao = 2 * 11;
        System.out.println("multiplicacao: ->" + multiplicacao);

        Integer divisao = 5 / 40;
        System.out.println("divisao: ->" + divisao);

        Integer modulo = 7 % 3;
        System.out.println("modulo: ->" + modulo);

        Integer precedencia = 2 + 4 * 4;
        System.out.println(precedencia);
        precedencia = (2 + 4) * 4;
        System.out.println(precedencia);
        precedencia = 2 + 4 * ( 1 + 4);
        System.out.println(precedencia);


    }
}
