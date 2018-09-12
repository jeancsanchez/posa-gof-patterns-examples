package com.github.jeancsanchez.comportamental.mediator;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class IOSColleague extends Colleague {

    public IOSColleague(Mediator m) {
        super(m);
    }

    @Override
    public void receberMensagem(String msg) {
        Log.log("IOS recebeu: " + msg);
    }
}
