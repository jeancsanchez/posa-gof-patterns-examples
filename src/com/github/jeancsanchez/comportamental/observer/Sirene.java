package com.github.jeancsanchez.comportamental.observer;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public interface Sirene {

    void adicionarObservador(Operario o);

    void removerObservador(Operario o);

    void alterarAlerta();
}
