package aula09;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        var dateLocal = LocalDate.now(); // yyyy-MM-dd
        System.out.println(dateLocal);

        var dataEspecifica = LocalDate.of(2019, 10, 10); // Cria uma data especifica;
        System.out.println(dataEspecifica);
        System.out.println(dateLocal.getDayOfMonth()); // Recupera o mês;
        System.out.println(dateLocal.getMonth()); // Recupera o dia;
        System.out.println(dateLocal.getYear()); // Recupera o ano;
        System.out.println(dateLocal.getDayOfYear()); // Retorna o dia no ano (ex: 87)
        dateLocal.plusDays(10); // Soma 10 dias;
        dateLocal.plusMonths(2); // Soma dois meses;
        dateLocal.plusYears(2); // Soma dois anos;

        var dataTime = LocalDateTime.now(); // yyyy-MM-dd HH:mm:ss
        System.out.println(dataTime);

        var dataTimeEspecifica = LocalDateTime.of(2019, 10, 10, 10, 10, 10); // Cria uma data especifica;
        System.out.println(dataTimeEspecifica);
        var atual = LocalDateTime.of(2024, 1, 28, 10, 59, 10);
        System.out.println(atual.getYear()); // Retorna o ano
        System.out.println(atual.getMonth()); // Retorna o mês
        System.out.println(atual.getDayOfMonth()); // Retorna o dia do mês
        System.out.println(atual.getMonthValue()); // Retorna o mês numérico
        System.out.println(atual.getDayOfYear()); // Retorna o dia da ano
        System.out.println(atual.getDayOfWeek()); // Retorna o dia do semana
        System.out.println(atual.getHour()); // Retorna a hora
        System.out.println(atual.getMinute()); // Retorna os minutos
        System.out.println(atual.getSecond()); // Retorna os segundos
        System.out.println(atual.getNano()); // Retorna o nanossegundos

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);// Retorna todos os dados da data atual

        System.out.println(Calendar.YEAR); // Retorna o ano
        System.out.println(calendar.get(Calendar.MONTH)); // Retorna o mês

        // FORMATANDO DATA
        var dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Regra de formatação
        var dataFormatada = dateLocal.format(dtf); // Formata a data
        System.out.println(dateLocal); // Exibe a data no formato padrão ISO
        System.out.println(dataFormatada);
    }
}
