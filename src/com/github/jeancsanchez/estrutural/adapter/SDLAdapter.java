package com.github.jeancsanchez.estrutural.adapter;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class SDLAdapter extends SDLSurface implements ImagemTarget {
    @Override
    public void carregarImagem(String nomeDoArquivo) {
        sdlCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenhaImagem(int posX, int posY, int largura, int altura) {
        sdlDesenharImagem(posX, posY);
    }
}
