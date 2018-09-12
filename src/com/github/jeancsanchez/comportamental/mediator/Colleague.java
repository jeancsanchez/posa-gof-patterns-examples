package com.github.jeancsanchez.comportamental.mediator;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator m) {
        mediator = m;
    }

    public void enviarMensagem(String msg) {
        mediator.enviar(msg, this);
    }

    public abstract void receberMensagem(String msg);
}
