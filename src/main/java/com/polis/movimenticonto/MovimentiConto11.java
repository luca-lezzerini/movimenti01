/*
 */
package com.polis.movimenticonto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author use
 */
public class MovimentiConto11 {

    public static void main(String[] args) {
        List<MovimentoContoCorrente> movimenti = new ArrayList<>();
        movimenti.add(new EntrataContoSenzaSpese(1_000));
        movimenti.add(new UscitaContoConSpese(200));
        movimenti.add(new UscitaContoConSpese(100));
        movimenti.add(new UscitaContoSenzaSpese(50));
        movimenti.add(new EntrataContoConSpese(570));
//        movimenti.add(new MovimentoContoCorrente(570));
//        movimenti.add(new EntrataConto(570));

        // stampa elenco movimenti
        double saldo = 0.0;
        for (MovimentoContoCorrente m : movimenti) {
            System.out.println(m.getClass().getCanonicalName() + " " + m);
            saldo -= m.speseMovimento();
            saldo += m.getImporto();
        }
        System.out.println("Il saldo vale " + saldo);
    }
}
