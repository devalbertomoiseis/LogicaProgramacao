package VariaveisConstantes;

public class TiposLogicos05 {
    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: " + variavelFalsa);

        Integer idade = 10;
        Boolean podeTirarCarteira = idade >= 18;

        if(podeTirarCarteira){
            System.out.println("Sim !Ele(a) pode tirar a carteira ?" + podeTirarCarteira);
        }else{
            System.out.println("Não! Ele(a) não pode tirar a carteira" + podeTirarCarteira);
        }

    }
}
