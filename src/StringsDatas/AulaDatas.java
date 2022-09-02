package StringsDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class AulaDatas {
    public static void main(String[] args) {
        String nome = "alberto";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje.getDayOfWeek());
        System.out.println(hoje.getDayOfMonth());
        System.out.println(hoje.getDayOfYear());
        Locale brasil = new Locale("pt", "BR");
        System.out.println("Tradução para BR: " + hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;

        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        }else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        }else if(agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else{
            saudacao = "Olá.";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

    }
}
