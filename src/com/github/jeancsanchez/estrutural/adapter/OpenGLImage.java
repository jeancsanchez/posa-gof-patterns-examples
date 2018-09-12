package com.github.jeancsanchez.estrutural.adapter;

import com.github.jeancsanchez.Log;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class OpenGLImage {

    public void glCarregarImagem(String arquivo) {
        Log.log("Imagem " + arquivo + " carregada.");
    }

    public void glDesenharImagem(int posX, int posY) {
        Log.log("OpenGL Image desenhada");
    }
}
