package Esercitazione;

import java.util.ArrayList;
import java.util.List;

public class Ricerche {

    public static void main(String[] args) {
        int limite = 10_000;
        List<Integer> ta = new ArrayList<>();
        for (int i = 0; i < limite; i++) {
            ta.add(i);
        }
        for (Integer targa : ta) {
            if (targa.equals(1313)){
                System.out.println("Trovata!");
                break;
            }
        }
    }

}
