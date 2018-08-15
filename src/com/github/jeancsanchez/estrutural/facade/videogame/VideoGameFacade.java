package com.github.jeancsanchez.estrutural.facade.videogame;

public class VideoGameFacade {
    private SistemaAudio sistemaAudio;
    private SistemaVideo sistemaVideo;
    private SistemaInput sistemaInput;


    public void inicializarSubSistemas() {
        sistemaAudio = new SistemaAudio();
        sistemaAudio.configurarCanais();
        sistemaAudio.configurarFrequencia();
        sistemaAudio.configurarVolume();

        sistemaVideo = new SistemaVideo();
        sistemaVideo.configurarCores();
        sistemaVideo.configurarResolucao();

        sistemaInput = new SistemaInput();
        sistemaInput.configurarJoystick();
        sistemaInput.configurarTeclado();
    }

    public void reproduzirAudio(String arquivo) {
        sistemaAudio.reproduzirAudio(arquivo);
    }

    public void renderizarImagem(String imagem) {
        sistemaVideo.renderizarImagem(imagem);
    }

    public void lerInput() {
        sistemaInput.lerInput();
    }
}
