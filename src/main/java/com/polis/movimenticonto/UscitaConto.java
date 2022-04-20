package com.polis.movimenticonto;

public abstract class UscitaConto extends MovimentoContoCorrente {

    public UscitaConto(double importo) {
        super(importo);
    }

    @Override
    public double getImporto() {
        return -super.getImporto();
    }
    
    
}
