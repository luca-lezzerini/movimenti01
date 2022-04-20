/*
 */
package com.polis.movimenticonto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author use
 */
public class MovimentiConto111 {

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
            System.out.println(m.getClass().getCanonicalName() + " " + m);
            if (m instanceof EntrataConto) {
                saldo += m.getImporto();
            } else if (m instanceof UscitaConto) {
                saldo -= m.getImporto();
            } else {
                System.out.println("Errore!!!");
            }
        }
        System.out.println("Il saldo vale " + saldo);
    }
}
