package com.mycompany.estudoscampoeletrico;

import static java.lang.Math.pow;
public class Carga {
    private double valorDaCarga;
    private double distanciaEixoX;
    private double distanciaEixoY;
    
    public Carga () {
        valorDaCarga = 0;
        distanciaEixoX = 0;
        distanciaEixoY = 0;
    }

    public double getValorDaCarga() {
        return valorDaCarga;
    }

    public void setValorDaCarga(double valorDaCarga) {
        this.valorDaCarga = valorDaCarga;
    }

    public double getDistanciaEixoX() {
        return distanciaEixoX;
    }

    public void setDistanciaEixoX(double distanciaEixoX) {
        this.distanciaEixoX = distanciaEixoX;
    }

    public double getDistanciaEixoY() {
        return distanciaEixoY;
    }

    public void setDistanciaEixoY(double distanciaEixoY) {
        this.distanciaEixoY = distanciaEixoY;
    }
    
    public double distanciaEntre2cargas(Carga q2) {
        return Math.sqrt(Math.pow(distanciaEixoX - q2.getDistanciaEixoX(), 2)
                   + Math.pow(distanciaEixoY - q2.getDistanciaEixoY(), 2));
    }
}
