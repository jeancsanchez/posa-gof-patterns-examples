package com.github.jeancsanchez.estrutural.decorator.carro;

public class CarroDecorator implements Carro {

    protected Carro carroDecorado;

    public CarroDecorator(Carro carro) {
        this.carroDecorado = carro;
    }

    @Override
    public double getCusto() {
        return carroDecorado.getCusto();
    }

    @Override
    public String getDescricao() {
        return carroDecorado.getDescricao();
    }

    @Override
    public String getProdutos() {
        return carroDecorado.getProdutos();
    }
}
