package com.github.jeancsanchez.estrutural.decorator.carro;

public class CarroComArCondicionado extends CarroDecorator {

    private double custo;
    private String produtos;

    public CarroComArCondicionado(Carro carro) {
        super(carro);
        this.custo = 900;
        this.produtos = "Ar condicionado";
        System.out.println("Adicionando Ar condicionado R$ " + custo);
    }


    @Override
    public double getCusto() {
        return super.getCusto() + custo;
    }


    @Override
    public String getDescricao() {
        return super.getDescricao();
    }

    @Override
    public String getProdutos() {
        return super.getProdutos() + ", " + produtos;
    }
}
