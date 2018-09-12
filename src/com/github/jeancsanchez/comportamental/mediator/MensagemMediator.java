package com.github.jeancsanchez.comportamental.mediator;

import com.github.jeancsanchez.Log;

import java.util.ArrayList;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class MensagemMediator implements Mediator {

    protected ArrayList<Colleague> contatos;

    public MensagemMediator() {
        contatos = new ArrayList<>();
    }

    public void adicionarColleague(Colleague colleague) {
        contatos.add(colleague);
    }

    @Override
    public void enviar(String msg, Colleague colleague) {
        for (Colleague contato : contatos) {
            if (contato != colleague) {
                definirProtocolo(contato);
                contato.receberMensagem(msg);
            }
        }
    }

    private void definirProtocolo(Colleague contato) {
        if (contato instanceof IOSColleague) {
            Log.log("Protocolo IOS");
        } else {
            Log.log("Protocolo Android");
        }
    }
}
