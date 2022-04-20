package com.polis.movimenticonto;

public class EntrataContoSenzaSpese extends EntrataConto {

    public EntrataContoSenzaSpese(double importo) {
        super(importo);
    }

    @Override
    public double speseMovimento() {
        return 0;
    }

}
