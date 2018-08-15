package com.github.jeancsanchez.tests;

import com.github.jeancsanchez.estrutural.facade.moda.ModaFacade;
import com.github.jeancsanchez.estrutural.facade.videogame.VideoGameFacade;

/**
 * Estrural de objeto
 * <p>
 * Uma interface que encapsula subsistemas. Nesse exemplo, subsistemas de mídia são encapsulados para que o cliente só
 * use o Facade para interação.
 */
public class FacadeTest {

    public FacadeTest(){
        System.out.println("::::: Facade testes :::::");
    }

    public void videoGameTest() {
        System.out.println("-- Video Game --");
        VideoGameFacade fachada = new VideoGameFacade();
        fachada.inicializarSubSistemas();

        fachada.renderizarImagem("logo.png");
        fachada.reproduzirAudio("entrada.mp3");
        fachada.lerInput();
    }

    public void modaTest() {
        System.out.println("-- Moda --");
        ModaFacade fachada = new ModaFacade();
        fachada.decidirVestimenta(100);
        fachada.decidirVestimenta(30);
        fachada.decidirVestimenta(5);
    }
}
