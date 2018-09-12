package com.github.jeancsanchez.estrutural.adapter;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class SDLSurface {

    public void sdlCarregarImagem(String arquivo) {
        Log.log("Imagem " + arquivo + " carregada.");
    }

    public void sdlDesenharImagem(int posX, int posY) {
        Log.log("SDL Surface imagem desenhada");
    }
}
