package StringsDatas;

public class Introducao {
    public static void main(String[] args) {
        String nome = "Alberto Moiseis";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());
        String nome1 = "Alberto Moiseis";
        System.out.println(nome.equals(nome1));// Ver valores iguais
        System.out.println(nome.equalsIgnoreCase(nome1));// Ver valores iguais, ignorando letras maisculas e minusculas
    }
}
