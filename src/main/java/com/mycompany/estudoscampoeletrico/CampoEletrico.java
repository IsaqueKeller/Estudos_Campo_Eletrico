package com.mycompany.estudoscampoeletrico;
public class CampoEletrico extends ForcaEletrostatica {
    private ForcaEletrostatica forcaDentroDoCampo;
    private Carga cargaGeradora;
    private double valorCampoEletrico;

    public CampoEletrico (Carga cargaGeradora, Carga cargaTeste, double distancia) {
        super(cargaGeradora, cargaTeste, distancia);
        this.cargaGeradora = cargaGeradora;
        valorCampoEletrico = 0;
    }

    public double calcularCampoEletrico (ForcaEletrostatica forcaDentroDoCampo , Carga cargaGeradora) {
        return (super.getConstanteEletrostatica() * cargaGeradora.getValorDaCarga())/Math.pow(super.getDistancia() , 2);
    }
    
    public ForcaEletrostatica getForcaDentroDoCampo() {
        return forcaDentroDoCampo;
    }

    public void setForcaDentroDoCampo(ForcaEletrostatica forcaDentroDoCampo) {
        this.forcaDentroDoCampo = forcaDentroDoCampo;
    }

    public Carga getCargaGeradora() {
        return cargaGeradora;
    }

    public void setCargaGeradora(Carga cargaGeradora) {
        this.cargaGeradora = cargaGeradora;
    }

    public double getValorCampoEletrico() {
        return valorCampoEletrico;
    }

    public void setValorCampoEletrico(double valorCampoEletrico) {
        this.valorCampoEletrico = valorCampoEletrico;
    }
}
