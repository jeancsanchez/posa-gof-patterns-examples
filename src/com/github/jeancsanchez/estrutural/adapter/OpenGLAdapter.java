package com.github.jeancsanchez.estrutural.adapter;

/**
 * @author Jean Carlos (Github: @jeancsanchez)
 * @date 12/09/18.
 * Jesus is alive!
 */
public class OpenGLAdapter extends OpenGLImage implements ImagemTarget {

    @Override
    public void carregarImagem(String nomeDoArquivo) {
        glCarregarImagem(nomeDoArquivo);
    }

    @Override
    public void desenhaImagem(int posX, int posY, int largura, int altura) {
        glDesenharImagem(posX, posY);
    }
}
