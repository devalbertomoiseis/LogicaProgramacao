package Laços;

public class AulaFor {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            // Para cada interação do i, terar 10 interação do j
            for (int j = 1 ; j <= 10; j++){
                System.out.println(j + " x " + i + " = " + j * i);
            }
        }
    }
}
