package com.polis.movimenticonto;

public class EntrataContoConSpese extends EntrataConto {

    public EntrataContoConSpese(double importo) {
        super(importo);
    }

    @Override
    public double speseMovimento() {
        return 1.0;
    }

}
