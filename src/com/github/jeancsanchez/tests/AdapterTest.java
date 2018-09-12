package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.estrutural.adapter.ImagemTarget;
import com.github.jeancsanchez.estrutural.adapter.OpenGLAdapter;
import com.github.jeancsanchez.estrutural.adapter.SDLAdapter;

/**
 * Estrutural de classe e objeto.
 * Converte a interface de uma classe em outra interface, esperada pelos clientes.
 */
public class AdapterTest {

    public AdapterTest() {
        System.out.println("::::: Adapter testes :::::");
    }

    public void imagemTest() {
        Log.log("-- Imagens --");

        ImagemTarget imagemTarget = new OpenGLAdapter();
        imagemTarget.carregarImagem("teste.png");
        imagemTarget.desenhaImagem(0, 0, 10, 10);

        imagemTarget = new SDLAdapter();
        imagemTarget.carregarImagem("teste.png");
        imagemTarget.desenhaImagem(0, 0, 10, 10);
    }
}
