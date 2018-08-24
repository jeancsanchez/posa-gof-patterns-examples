package com.github.jeancsanchez.estrutural.composite.congresso;

public class Participante {

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar(Participante participante) throws Exception {
        throw new Exception(this.nome + "  não pode adicionar " + participante.getNome());
    }

    public void remover(Participante participante) throws Exception {
        throw new Exception(this.nome + "  não pode adicionar " + participante.getNome());
    }

    public Participante getParticipante(Participante participante) throws Exception {
        throw new Exception(this.nome + "  não pode adicionar " + participante.getNome());
    }

    public void printNomeDoParticipante() {
        System.out.println(this.getNome());
    }
}
