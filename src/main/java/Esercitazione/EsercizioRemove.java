package Esercitazione;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EsercizioRemove {

    public static void main(String[] args) {
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
