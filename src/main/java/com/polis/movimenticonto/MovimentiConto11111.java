/*
 */
package com.polis.movimenticonto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author use
 */
public class MovimentiConto11111 {

    public static void main(String[] args) {
        List<MovimentoContoCorrente> movimenti = new ArrayList<>();
        movimenti.add(new EntrataConto(1_000));
        movimenti.add(new UscitaConto(200));
        movimenti.add(new UscitaConto(100));
        movimenti.add(new UscitaConto(50));
        movimenti.add(new EntrataConto(570));
//        movimenti.add(new MovimentoContoCorrente(570));

        // stampa elenco movimenti
        double saldo = 0.0;
        for (MovimentoContoCorrente m : movimenti) {
            stampaMovimento(m);
            saldo = aggiornaSaldoDaMovimento(m, saldo);
        }
        System.out.println("Il saldo vale " + saldo);
    }

    private static void stampaMovimento(MovimentoContoCorrente m) {
        System.out.println(m.getClass().getCanonicalName() + " " + m);
    }

    private static double aggiornaSaldoDaMovimento(MovimentoContoCorrente m, double saldo) {
        if (m instanceof EntrataContoConSpese) {
                saldo += m.getImporto();
                saldo -= 1.0;
            } else if (m instanceof UscitaContoConSpese) {
                saldo -= m.getImporto();
                saldo -= 2.0;
            } else if (m instanceof EntrataContoSenzaSpese) {
                saldo += m.getImporto();
            } else if (m instanceof UscitaContoSenzaSpese) {
                saldo -= m.getImporto();
            } else {
                System.out.println("Errore!!!");
            }
        return saldo;
    }
}
