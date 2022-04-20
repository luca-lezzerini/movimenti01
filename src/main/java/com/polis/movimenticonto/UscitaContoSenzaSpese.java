package com.polis.movimenticonto;

public class UscitaContoSenzaSpese extends UscitaConto {

    public UscitaContoSenzaSpese(double importo) {
        super(importo);
    }

    @Override
    public double speseMovimento() {
        return 0;
    }

}
