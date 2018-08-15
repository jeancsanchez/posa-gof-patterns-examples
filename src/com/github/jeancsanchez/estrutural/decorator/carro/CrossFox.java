package com.github.jeancsanchez.estrutural.decorator.carro;

public class CrossFox implements Carro {

    private double custo = 50.000;
    private String produtos = "Cross Fox 1.6";
    private String descricao = "Novo Cross Fox";

    @Override
    public double getCusto() {
        return custo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getProdutos() {
        return produtos;
    }
}
