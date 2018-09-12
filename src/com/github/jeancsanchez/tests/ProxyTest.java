package com.github.jeancsanchez.tests;


import com.github.jeancsanchez.Log;
import com.github.jeancsanchez.estrutural.proxy.BancoProxy;
import com.github.jeancsanchez.estrutural.proxy.BancoUsuarios;

/**
 * Estrutural de  objeto.
 * Provê um substituto ou ponto através do qual um objeto possa controlar o acesso a outro.
 */
public class ProxyTest {

    public ProxyTest() {
        Log.log("::::: Proxy testes :::::");
    }

    public void bancoDeDadosTest() {
        Log.log("-- Banco de dados --");

        Log.log("Hacker acessando...");
        BancoUsuarios bancoUsuarios = new BancoProxy("Hacker", "12345");
        Log.log(bancoUsuarios.getQtdUsuarios());
        Log.log(bancoUsuarios.getUsuariosConectados());


        Log.log("Administrador acessando...");
        bancoUsuarios = new BancoProxy("admin", "admin");
        Log.log(bancoUsuarios.getQtdUsuarios());
        Log.log(bancoUsuarios.getUsuariosConectados());
    }
}
