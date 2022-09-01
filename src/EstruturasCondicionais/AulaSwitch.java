package EstruturasCondicionais;

public class AulaSwitch {
    public static void main(String[] args) {

        String graduacao = "A";
        switch (graduacao){
                case "A":
                System.out.println("A");
                break;
                case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("sem graduação");

        }
    }
}
