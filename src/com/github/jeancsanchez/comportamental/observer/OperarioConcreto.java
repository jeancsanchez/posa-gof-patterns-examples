package com.github.jeancsanchez.comportamental.observer;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class OperarioConcreto implements Operario {

    private SireneConcreta objetoObservado;

    public OperarioConcreto(SireneConcreta sirene) {
        this.objetoObservado = sirene;
        objetoObservado.adicionarObservador(this);
    }

    @Override
    public void atualizar(Sirene s) {
        if (s == objetoObservado) {
            Log.log("[INFO] A Sirene mudou seu estado para: " + objetoObservado.getAlerta());
        }
    }
}
