package com.polis.movimenticonto;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovimentoContoCorrente {

    private LocalDate data;
    private LocalTime orario;
    private double importo;
    private String causale;

    public MovimentoContoCorrente(double importo) {
        this.importo = importo;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getOrario() {
        return orario;
    }

    public void setOrario(LocalTime orario) {
        this.orario = orario;
    }

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getCausale() {
        return causale;
    }

    public void setCausale(String causale) {
        this.causale = causale;
    }

    @Override
    public String toString() {
        return "MovimentoContoCorrente{" + "data=" + data + ", orario=" + orario + ", importo=" + importo + ", causale=" + causale + '}';
    }

    
}
