package Esercitazione;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EsercizioRemove {

    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2022, Month.APRIL, 20);
        
        List<String> lista = new ArrayList<>();

        lista.add("Gennaio");
        lista.add("Febbraio");
        lista.add("Marzo");
        lista.add("Aprile");
        lista.add("Gennaio");

//        lista.remove(1);

        for (String s : lista) {
            System.out.println(s);
        }

        Set<String> set = new HashSet<>();
        set.add("Lunedì");
        set.add("Martedì");
        set.add("Mercoledì");
        set.add("Giovedì");
        set.add("Lunedì");
        System.out.println("-------------------");
        for (String s : set) {
            System.out.println(s);
        }
    }

}
