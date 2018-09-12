package com.github.jeancsanchez.comportamental.banco;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public abstract class BancoChain {

    protected BancoChain next;
    protected IDBancos idBanco;

    public BancoChain(IDBancos id) {
        next = null;
        idBanco = id;
    }

    public void setNext(BancoChain chain) {
        if (next == null) {
            next = chain;
            return;
        }

        next.setNext(chain);
    }

    public void efetuarPagamento(IDBancos id) throws Exception {
        if (idBanco == id) {
            efetuaPagamento();
        } else {
            if (next == null) {
                throw new Exception("Banco não cadastrado");
            }

            next.efetuarPagamento(id);
        }
    }

    protected abstract void efetuaPagamento();
}
