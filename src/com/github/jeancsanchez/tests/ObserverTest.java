package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.comportamental.observer.Operario;
import com.github.jeancsanchez.comportamental.observer.OperarioConcreto;
import com.github.jeancsanchez.comportamental.observer.SireneConcreta;

/**
 * Comportamental de objeto.
 * Define uma dependência de um-para-muitos entre objetos para que quando um objeto mudar de estado, todos os seus
 * dependentes sejam notificados e atualizados automaticamente.
 */
public class ObserverTest {

    public ObserverTest() {
        System.out.println("::::: Observer testes :::::");
    }

    public void sireneTest() {
        Log.log("-- Sirene --");

        SireneConcreta sirene = new SireneConcreta();
        Operario obs1 = new OperarioConcreto(sirene);
        Operario obs2 = new OperarioConcreto(sirene);

        sirene.alterarAlerta();
        sirene.alterarAlerta();
    }
}
