package com.github.jeancsanchez.estrutural.composite.arquivos;

import java.util.ArrayList;

public class ArquivoComposite extends ArquivoComponent {

    ArrayList<ArquivoComponent> arquivos = new ArrayList<>();


    public ArquivoComposite(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void adicionar(ArquivoComponent arquivo) {
        this.arquivos.add(arquivo);
    }

    @Override
    public void remover(String nomeDoArquivo) throws Exception {
        for (ArquivoComponent arquivo : arquivos) {
            if (arquivo.getNomeDoArquivo().equals(nomeDoArquivo)) {
                this.arquivos.remove(arquivo);
                return;
            }
        }

        throw new Exception("Não existe o arquivo " + nomeDoArquivo);
    }

    @Override
    public void printNomeDoArquivo() {
        System.out.println(this.nomeDoArquivo);

        for (ArquivoComponent arquivo : arquivos) {
            arquivo.printNomeDoArquivo();
        }
    }


    @Override
    public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
        for (ArquivoComponent arquivo : arquivos) {
            if (arquivo.getNomeDoArquivo().equals(nomeDoArquivo)) {
                return arquivo;
            }
        }

        throw new Exception("Não existe o arquivo " + nomeDoArquivo);
    }
}
