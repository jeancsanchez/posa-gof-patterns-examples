package com.github.jeancsanchez.estrutural.composite.congresso;

import java.util.ArrayList;

public class Congresso extends Participante {

    private ArrayList<Participante> participantes = new ArrayList<>();


    @Override
    public void setNome(String nome) {
        super.setNome("Congresso " + nome);
    }

    @Override
    public void adicionar(Participante participante) {
        System.out.println("Adicionando " + participante.getNome());
        this.participantes.add(participante);
    }

    @Override
    public void remover(Participante participante) throws Exception {
        for (Participante partic : participantes) {
            if (partic.getNome().equals(participante.getNome())) {
                this.participantes.remove(partic);
                System.out.println("Removendo " + partic.getNome());
                return;
            }
        }

        throw new Exception("Não existe o participante" + participante.getNome());
    }

    @Override
    public void printNomeDoParticipante() {
        System.out.println(this.getNome());

        for (Participante congresso : participantes) {
            congresso.printNomeDoParticipante();
        }
    }


    @Override
    public Participante getParticipante(Participante participante) throws Exception {
        for (Participante partic : participantes) {
            if (partic.getNome().equals(participante.getNome())) {
                return partic;
            }
        }

        throw new Exception("Não existe o participante" + participante.getNome());
    }
}
