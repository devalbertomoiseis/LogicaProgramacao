package Vetor;

public class AulaVetor {
    public static void main(String[] args) {
        int[] numeros = { 1, 6 , 9, 12,14, 65};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);
        System.out.println("Media: "+ media/numeros.length);
    }
}
