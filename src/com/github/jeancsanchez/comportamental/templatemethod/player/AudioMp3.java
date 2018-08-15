package com.github.jeancsanchez.comportamental.templatemethod.player;

public class AudioMp3 {

    private String nome;
    private int estrela;


    public AudioMp3(String nome, int estrela) {
        this.nome = nome;
        this.estrela = estrela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstrela() {
        return estrela;
    }

    public void setEstrela(int estrela) {
        this.estrela = estrela;
    }
}
