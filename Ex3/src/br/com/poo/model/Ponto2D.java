package br.com.poo.model;

import javax.swing.plaf.synth.Region;

public class Ponto2D {
    private double PosicaoX;
    private double PosicaoY;

    public String toString(){
        String StrRetorno = "Posição X: " + this.PosicaoX + "\n" + "Posição Y: " + this.PosicaoY;
        return StrRetorno;
    }

    // Construtor sem parametros inicializará o ponto na origem
    public Ponto2D(){
        this.PosicaoX = 0;
        this.PosicaoY = 0;
    }

    // Construtor sobrecarregado que inicializará o ponto nas posições passadas como parametros
    public Ponto2D(double PosicaoX, double PosicaoY){
        this.PosicaoX = PosicaoX;
        this.PosicaoY = PosicaoY;
    }

    // Construtor sobrecarregado que inicializará o ponto no mesmo local em que o ponto passado por parametro
    public Ponto2D(Ponto2D PontoAux){
        this.PosicaoX = PontoAux.getPosicaoX();
        this.PosicaoY = PontoAux.getPosicaoY();
    }

    public void MovimentaPonto(){
        this.PosicaoX = 0;
        this.PosicaoY = 0;
    }

    public void MovimentaPonto(double NovaPosX, double NovaPosY){
        this.PosicaoX = NovaPosX;
        this.PosicaoY = NovaPosY;
    }

    public void MovimentaPonto(Ponto2D PontoRef){
        this.PosicaoX = PontoRef.getPosicaoX();
        this.PosicaoY = PontoRef.getPosicaoY();
    }

    public Double CalcDistancia(Ponto2D PontoAlvo){
        double x1 = this.PosicaoX;
        double y1 = this.PosicaoY;
        double x2 = PontoAlvo.getPosicaoX();
        double y2 = PontoAlvo.getPosicaoY();
        double Distancia, Param1, Param2;

        // Formula utilizada: d(A,B)^2 = (x2 - x1)^2 + (y2 - y1)^2
        Param1 = Math.pow((x2 - x1), 2);
        Param2 = Math.pow((y2 - y1), 2);

        Distancia = Math.sqrt((Param1 + Param2));

        return Distancia;
    }

    // Método de clonagem de objeto
    public Ponto2D clone() {
        return this;
    }

    public boolean equals(Ponto2D PontoCompare){
        if(PontoCompare == null){
            return false;
        }

        if(this.PosicaoX == PontoCompare.getPosicaoX() && this.PosicaoY == PontoCompare.getPosicaoY()){
            return true;
        }

        return false;
    }

    // [INICIO] - Métodos Get e Sets dos atributos privados
    public double getPosicaoX() {
        return PosicaoX;
    }

    public double getPosicaoY() {
        return PosicaoY;
    }

    public void setPosicaoX(double posicaoX) {
        PosicaoX = posicaoX;
    }

    public void setPosicaoY(double posicaoY) {
        PosicaoY = posicaoY;
    }
    // [FIM] - Métodos Get e Sets dos atributos privados
}