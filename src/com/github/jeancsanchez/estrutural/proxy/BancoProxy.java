package com.github.jeancsanchez.estrutural.proxy;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class BancoProxy extends BancoUsuarios {

    protected String usuario, senha;

    public BancoProxy(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String getQtdUsuarios() {
        if (temPermissao()) {
            return super.getQtdUsuarios();
        }

        return null;
    }


    @Override
    public String getUsuariosConectados() {
        if (temPermissao()) {
            return super.getUsuariosConectados();
        }

        return null;
    }

    private boolean temPermissao() {
        return usuario.equals("admin") && senha.equals("admin");
    }
}
