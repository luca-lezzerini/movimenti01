package com.polis.movimenticonto;

public class UscitaContoConSpese extends UscitaConto {

    public UscitaContoConSpese(double importo) {
        super(importo);
    }

    @Override
    public double speseMovimento() {
        return 2.0;
    }

}
