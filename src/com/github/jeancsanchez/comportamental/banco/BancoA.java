package com.github.jeancsanchez.comportamental.banco;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class BancoA extends BancoChain {

    public BancoA() {
        super(IDBancos.BANCO_A);
    }

    @Override
    protected void efetuaPagamento() {
        Log.log("Pagamento efetuado no banco A");
    }
}
