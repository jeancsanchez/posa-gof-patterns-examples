package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.comportamental.mediator.AndroidColleague;
import com.github.jeancsanchez.comportamental.mediator.IOSColleague;
import com.github.jeancsanchez.comportamental.mediator.MensagemMediator;

/**
 * Comportamental de objeto.
 * Diminui a necessidade de interconexão entre os objetos.
 */
public class MediatorTest {

    public MediatorTest() {
        Log.log("::::: Mediator testes :::::");
    }

    public void mensagensTest() {
        Log.log("-- Mensagens entre plataformas --");

        MensagemMediator mediator = new MensagemMediator();

        AndroidColleague android = new AndroidColleague(mediator);
        IOSColleague ios = new IOSColleague(mediator);

        mediator.adicionarColleague(android);
        mediator.adicionarColleague(ios);

        android.enviarMensagem("Olá, eu sou um Android!");
        android.enviarMensagem("Olá, eu sou um IOS!");
    }
}
