package br.ufg.inf.mf.pratica;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.DayOfWeek;

public class Nome {
    public static void main(String[] args) {
        //Onde será gravada qual é o dia da semana.
	DayOfWeek dayOfWeek  = LocalDate.now().getDayOfWeek();
        //Irá mostrar o dia da semana na linguagem definida pelo sistema.
	System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
    } 
}

