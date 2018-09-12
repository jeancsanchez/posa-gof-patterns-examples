package com.github.jeancsanchez.estrutural.proxy;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class BancoUsuarios {

    private int qtdUsuarios;
    private int usuariosConectados;

    public BancoUsuarios() {
        qtdUsuarios = (int) (Math.random() * 100);
        usuariosConectados = (int) (Math.random() * 10);
    }


    public String getQtdUsuarios() {
        return "Total de usuários: " + qtdUsuarios;
    }

    public String getUsuariosConectados() {
        return "Usuários conectados: " + usuariosConectados;
    }
}
