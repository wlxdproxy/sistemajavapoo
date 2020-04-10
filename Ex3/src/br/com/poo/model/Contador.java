package br.com.poo.model;

public class Contador {
    private static int Valor = 0;

    public static void ZerarContador(){
        Valor = 0;
    }

    public static void Incrementar(){
        Valor = Valor + 1;
    }

    public static int RetornarContador(){
        return Valor;
    }
}
