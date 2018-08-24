package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoComponent;
import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoComposite;
import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoVideo;

/**
 * Estrutural de  objeto
 */
public class CompositeTest {

    public CompositeTest() {
        System.out.println("::::: Composite testes :::::");
    }

    public void arquivosTest() {
        System.out.println("-- Arquivos --");

        ArquivoComponent minhaPasta = new ArquivoComposite("minha_pasta/");
        ArquivoComponent video1 = new ArquivoVideo("video1.jpeg");
        ArquivoComponent video2 = new ArquivoVideo("video2.jpeg");


        try {
            video1.adicionar(video2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            minhaPasta.adicionar(video1);
            minhaPasta.adicionar(video2);
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("Pesquisando arquivos: ");
            minhaPasta.getArquivo(video1.getNomeDoArquivo()).printNomeDoArquivo();

            System.out.println("Removendo arquivos: ");
            minhaPasta.remover(video1.getNomeDoArquivo());
            minhaPasta.printNomeDoArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
