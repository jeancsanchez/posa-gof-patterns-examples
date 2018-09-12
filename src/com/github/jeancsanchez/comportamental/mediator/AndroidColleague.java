package com.github.jeancsanchez.comportamental.mediator;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class AndroidColleague extends Colleague {

    public AndroidColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String msg) {
        Log.log("Android recebeu: " + msg);
    }
}
