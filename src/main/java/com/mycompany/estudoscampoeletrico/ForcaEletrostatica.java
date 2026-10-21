package com.mycompany.estudoscampoeletrico;
import java.lang.Math;
import static java.lang.Math.pow;
import java.util.Scanner;

    public class ForcaEletrostatica {
        private double valorForca;
        private double constanteEletrostatica;
        private Carga carga1;
        private Carga carga2;
        private double distancia;

    public ForcaEletrostatica(Carga carga1 , Carga carga2) {
        valorForca = 0;
        constanteEletrostatica = 0;
        this.carga1 = carga1;
        this.carga2 = carga2;
    }
    
    public ForcaEletrostatica(Carga carga1 , Carga carga2 , double distancia) {
        valorForca = 0;
        constanteEletrostatica = 0;
        this.carga1 = carga1;
        this.carga2 = carga2;
        this.distancia = distancia;
    }
    
    public double CalcularForca () {
        return (constanteEletrostatica * carga1.getValorDaCarga() * carga2.getValorDaCarga())/(Math.pow(distancia, 2));
    }

    public double getValorForca() {
        return valorForca;
    }

    public void setValorForca(double valorForca) {
        this.valorForca = valorForca;
    }

    public double getConstanteEletrostatica() {
        return constanteEletrostatica;
    }

    public void setConstanteEletrostatica(double constanteEletrostatica) {
        this.constanteEletrostatica = constanteEletrostatica;
    }

    public Carga getCarga1() {
        return carga1;
    }

    public void setCarga1(Carga carga1) {
        this.carga1 = carga1;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
