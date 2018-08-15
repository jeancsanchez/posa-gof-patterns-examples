package com.github.jeancsanchez.estrutural.facade.videogame;

public class SistemaVideo {

    public void configurarCores() {
        System.out.println("Cores configuradas");
    }

    public void configurarResolucao() {
        System.out.println("Resolucao configurada");
    }

    public void renderizarImagem(String imagem) {
        System.out.println("Renderizando imagem " + imagem);
    }
}
