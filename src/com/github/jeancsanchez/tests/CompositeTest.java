package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoComponent;
import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoComposite;
import com.github.jeancsanchez.estrutural.composite.arquivos.ArquivoVideo;
import com.github.jeancsanchez.estrutural.composite.congresso.Congresso;
import com.github.jeancsanchez.estrutural.composite.congresso.Individuo;
import com.github.jeancsanchez.estrutural.composite.congresso.Instituicao;
import com.github.jeancsanchez.estrutural.composite.congresso.Participante;

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


    public void congressoTest() {
        System.out.println("-- Congresso --");

        Participante congresso = new Congresso();
        congresso.setNome("Internacional");

        Participante individuo = new Individuo();
        individuo.setNome("Jean");

        Participante instituicao = new Instituicao();
        instituicao.setNome("M. Dias Branco");


        try {
            individuo.adicionar(instituicao);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            congresso.adicionar(individuo);
            congresso.adicionar(instituicao);

            System.out.println("Participantes");
            congresso.printNomeDoParticipante();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println("Pesquisando participantes: ");
            congresso.getParticipante(individuo).printNomeDoParticipante();

            System.out.println("Removendo instituição: ");
            congresso.remover(instituicao);
            congresso.printNomeDoParticipante();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
