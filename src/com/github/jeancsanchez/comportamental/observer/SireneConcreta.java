package com.github.jeancsanchez.comportamental.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class SireneConcreta implements Sirene {

    private boolean alertaSonoro = false;
    private ArrayList observadores = new ArrayList();


    @Override
    public void adicionarObservador(Operario o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Operario o) {
        observadores.remove(o);
    }

    @Override
    public void alterarAlerta() {
        alertaSonoro = !alertaSonoro;
        notificarObservadores();
    }

    private void notificarObservadores() {
        Iterator i = observadores.iterator();
        while (i.hasNext()) {
            Operario o = (Operario) i.next();
            o.atualizar(this);
        }
    }

    public boolean getAlerta() {
        return alertaSonoro;
    }
}
