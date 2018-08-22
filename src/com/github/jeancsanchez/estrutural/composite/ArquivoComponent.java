package com.github.jeancsanchez.estrutural.composite;

public class ArquivoComponent {

    protected String nomeDoArquivo;

    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);
    }

    public String getNomeDoArquivo() {
        return this.nomeDoArquivo;
    }

    public void adicionar(ArquivoComponent arquivo) throws Exception {
        throw new Exception(this.nomeDoArquivo + " não é uma pasta!");
    }

    public void remover(String arquivo) throws Exception {
        throw new Exception(this.nomeDoArquivo + " não é uma pasta!");
    }

    public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
        throw new Exception(this.nomeDoArquivo + " não é uma pasta!");
    }
}
